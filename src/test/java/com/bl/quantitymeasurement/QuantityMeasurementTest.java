package com.bl.quantitymeasurement;

import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeet_When_ZeroFeet_ShouldReturnZero() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( QuantityMeasurementConstant.Unit.FEET, 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( QuantityMeasurementConstant.Unit.FEET, 0 );
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
    public void givenFeet_When_SameValue_ShouldReturnEqual() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 10.0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 10.0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenInch_When_Null_ShouldReturnFalse() {
        boolean checkNull = quantityMeasurement.equals( null );
        Assert.assertEquals( false, checkNull );
    }
    @Test
    public void givenInch_When_SameReference_ShouldReturnTrue() {
        QuantityMeasurement reference = new QuantityMeasurement();
        Assert.assertEquals( reference, quantityMeasurement );
    }
    @Test
    public void givenZeroInch_When_ZeroInch_ShouldReturnEqual() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( QuantityMeasurementConstant.Unit.INCH, 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( QuantityMeasurementConstant.Unit.INCH, 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenInch_When_SameValue_ShouldReturnEqual() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 50.0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 50.0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqual() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenFeetAndInch_WhenComparing_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 1 );
        QuantityMeasurement inch = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 12 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertTrue( compare );
    }
    @Test
    public void givenOneFeetAndOneInch_WhenComparing_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 1 );
        QuantityMeasurement feet = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 1 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertFalse( compare );
    }
    @Test
    public void givenOneInchAndOneFeet_WhenComparing_ShouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 1 );
        QuantityMeasurement feet = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 1 );
        boolean compare = inch.compareUnits( feet );
        Assert.assertFalse( compare );
    }
    @Test
    public void givenInchToFeet_WhenComparing_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement( QuantityMeasurement.Unit.FEET, 1 );
        QuantityMeasurement inch = new QuantityMeasurement( QuantityMeasurement.Unit.INCH, 12 );
        boolean compare = inch.compareUnits( feet );
        Assert.assertTrue( compare );
    }
}

