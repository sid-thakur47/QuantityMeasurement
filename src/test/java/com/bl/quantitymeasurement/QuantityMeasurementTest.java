package com.bl.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenZeroFeet_When_ZeroFeet_ShouldReturnZero() {
        QuantityMeasurement firstMeasurement=new QuantityMeasurement(0);
        QuantityMeasurement secondMeasurement=new QuantityMeasurement(0);
        Assert.assertEquals( firstMeasurement,secondMeasurement );
    }
}
