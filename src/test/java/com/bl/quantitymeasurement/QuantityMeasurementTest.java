package com.bl.quantitymeasurement;

import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;
import com.bl.quantitymeasurement.units.Length;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest implements QuantityMeasurementConstant {
    Length length = new Length();
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeet_When_ZeroFeet_ShouldReturnZero() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( Unit.FEET, 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( Unit.FEET, 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }

    @Test
    public void givenFeet_When_Null_ShouldReturnFalse() {
        boolean checkNull = length.equals( null );
        Assert.assertEquals( false, checkNull );
    }

    @Test
    public void givenFeet_When_SameReference_ShouldReturnTrue() {
        Length reference = new Length();
        Assert.assertEquals( reference, length );
    }

    @Test
    public void givenFeet_When_SameValue_ShouldReturnEqual() {
        Length firstMeasurement = new Length( Unit.FEET, 10.0 );
        Length secondMeasurement = new Length( Unit.FEET, 10.0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenInch_When_Null_ShouldReturnFalse() {
        boolean checkNull = quantityMeasurement.equals( null );
        Assert.assertEquals( false, checkNull );
    }
    @Test
    public void givenInch_When_SameReference_ShouldReturnTrue() {
        Length reference = new Length();
        Assert.assertEquals( reference, length );
    }
    @Test
    public void givenZeroInch_When_ZeroInch_ShouldReturnEqual() {
        Length firstMeasurement = new Length( Unit.INCH, 0 );
        Length secondMeasurement = new Length( Unit.INCH, 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenInch_When_SameValue_ShouldReturnEqual() {
        Length firstMeasurement = new Length( Unit.INCH, 50.0 );
        Length secondMeasurement = new Length( Unit.INCH, 50.0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqual() {
        Length firstMeasurement = new Length( Unit.INCH, 0 );
        Length secondMeasurement = new Length( Unit.FEET, 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenFeetAndInch_WhenComparing_ShouldReturnTrue() {
        Length feet = new Length( Unit.FEET, 1 );
        Length inch = new Length( Length.Unit.INCH, 12 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertTrue( compare );
    }
    @Test
    public void givenOneFeetAndOneInch_WhenComparing_ShouldReturnFalse() {
        Length inch = new Length( Unit.INCH, 1 );
        Length feet = new Length( Unit.FEET, 1 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertFalse( compare );
    }
    @Test
    public void givenOneInchAndOneFeet_WhenComparing_ShouldReturnFalse() {
        Length inch = new Length( Unit.INCH, 1 );
        Length feet = new Length( Unit.FEET, 1 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertFalse( compare );
    }
    @Test
    public void givenInchToFeet_WhenComparing_ShouldReturnTrue() {
        Length feet = new Length( Length.Unit.FEET, 1 );
        Length inch = new Length( Length.Unit.INCH, 12 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertTrue( compare );
    }
    @Test
    public void givenOneYardAndFeet_WhenComparing_ShouldReturnTrue() {
        Length feet = new Length( Length.Unit.FEET, 3 );
        Length yard = new Length( Length.Unit.YARD, 1 );
        boolean compare = feet.compareUnits( yard );
        Assert.assertTrue( compare );
    }
    @Test
    public void givenOneYardAndInch_WhenComparing_ShouldReturnTrue() {
        Length yard = new Length( Unit.YARD, 1 );
        Length inch = new Length( Length.Unit.INCH, 36 );
        boolean compare = yard.compareUnits( inch );
        Assert.assertTrue( compare );
    }
    @Test
    public void givenInchAndOneYard_WhenComparing_ShouldReturnTrue() {
        Length inch = new Length( Length.Unit.INCH, 36 );
        Length yard = new Length( Length.Unit.YARD, 1 );
        boolean compare = yard.compareUnits( inch );
        Assert.assertTrue( compare );
    }
    @Test
    public void givenFeetAndOneYardAndFeet_WhenComparing_ShouldReturnTrue() {
        Length yard = new Length( Length.Unit.YARD, 1 );
        Length feet = new Length( Length.Unit.FEET, 3 );
        boolean compare = feet.compareUnits( yard );
        Assert.assertTrue( compare );
    }
}