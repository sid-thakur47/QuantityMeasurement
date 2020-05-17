package com.bl.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeet_When_ZeroFeet_ShouldReturnZero() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }

    @Test
    public void givenFeet_When_Null_ShouldReturnFalse() {
        boolean checkNull = quantityMeasurement.equals( null );
        Assert.assertEquals( false, checkNull );
    }

    @Test
    public void givenFeet_When_SameReference_ShouldReturnTrue() {
        QuantityMeasurement reference = new QuantityMeasurement();
        Assert.assertEquals( reference, quantityMeasurement );
    }

    @Test
    public void givenFeet_When_SameValue_ShouldReturnTrue() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( 10 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( 10 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
}