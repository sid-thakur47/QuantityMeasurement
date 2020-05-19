package com.bl.quantitymeasurement;

import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;
import com.bl.quantitymeasurement.units.Length;
import com.bl.quantitymeasurement.units.Volume;
import com.bl.quantitymeasurement.units.Weight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest implements QuantityMeasurementConstant {
    Length length;
    Volume volume;
    Weight weight;
    QuantityMeasurement quantityMeasurement;

    @Before
    public void run() {
        length = new Length();
        volume = new Volume();
        weight = new Weight();
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeet_When_ZeroFeet_ShouldReturnZero() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( Unit.FEET, 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( Unit.FEET, 0 );
        Assert.assertEquals( firstMeasurement, secondMeasurement );
    }
    @Test
    public void givenZeroFeet_When_OneFeet_ShouldReturnNotEqual() {
        QuantityMeasurement firstMeasurement = new QuantityMeasurement( Unit.FEET, 0 );
        QuantityMeasurement secondMeasurement = new QuantityMeasurement( Unit.FEET, 1 );
        Assert.assertNotEquals( firstMeasurement, secondMeasurement );
    }

    @Test
    public void givenFeet_When_Null_ShouldReturnFalse() {
        boolean checkNull = quantityMeasurement.equals( null );
        Assert.assertFalse( checkNull );
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
        Assert.assertFalse( checkNull );
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
    public void givenZeroInch_When_OneInch_ShouldReturnNotEqual() {
        Length firstMeasurement = new Length( Unit.INCH, 0 );
        Length secondMeasurement = new Length( Unit.INCH, 1 );
        Assert.assertNotEquals( firstMeasurement, secondMeasurement );
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
        Length inch = new Length( Unit.INCH, 12 );
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
        Length feet = new Length( Unit.FEET, 1 );
        Length inch = new Length( Unit.INCH, 1 );
        boolean compare = feet.compareUnits( inch );
        Assert.assertFalse( compare );
    }

    @Test
    public void givenInchToFeet_WhenComparing_ShouldReturnTrue() {
        Length feet = new Length( Unit.FEET, 1 );
        Length inch = new Length( Unit.INCH, 12 );
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
        Length inch = new Length( Unit.INCH, 36 );
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
        Length yard = new Length( Unit.YARD, 1 );
        Length feet = new Length( Unit.FEET, 3 );
        boolean compare = feet.compareUnits( yard );
        Assert.assertTrue( compare );
    }

    @Test
    public void givenTwoInchAndCentimeter_WhenComparing_ShouldReturnTrue() {
        Length inch = new Length( Unit.INCH, 2 );
        Length centiMeter = new Length( Unit.CENTIMETER, 5 );
        boolean compare = inch.compareUnits( centiMeter );
        Assert.assertTrue( compare );
    }

    @Test
    public void givenInchAndAnd_WhenAdded_ShouldReturnTrue() {
        Length inch = new Length( Unit.INCH, 2 );
        Length inch2 = new Length( Unit.INCH, 2 );
        double addition = length.addLength( inch, inch2 );
        Assert.assertEquals( 4, addition, 0.0 );
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnTrue() {
        Length feet = new Length( Unit.FEET, 1 );
        Length inch = new Length( Unit.INCH, 2 );
        double addition = length.addLength( feet, inch );
        Assert.assertEquals( 14, addition, 0.0 );
    }

    @Test
    public void givenTwoInchAndCentimeter_WhenAdded_ShouldReturnTrue() {
        Length inch = new Length( Unit.INCH, 4 );
        Length centiMeter = new Length( Unit.CENTIMETER, 5 );
        double addition = length.addLength( inch, centiMeter );
        Assert.assertEquals( 6, addition, 0.0 );
    }

    @Test
    public void givenOneGallonAndLiter_WhenCompared_ShouldReturnTrue() {
        Volume gallon = new Volume( Unit.GALLON, 1 );
        Volume liter = new Volume( Unit.LITRES, 3.78 );
        boolean compare = gallon.compareUnits( liter );
        Assert.assertTrue( compare );
    }

    @Test
    public void givenOneLitreAndMilliLitre_WhenCompared_ShouldReturnTrue() {
        Volume litre = new Volume( Unit.LITRES, 2 );
        Volume milliLitre = new Volume( Unit.MILLILITERS, 2000 );
        boolean compare = litre.compareUnits( milliLitre );
        Assert.assertTrue( compare );
    }

    @Test
    public void givenOneGallonAndTLitre_WhenAdded_ShouldReturnTrue() {
        Volume gallon = new Volume( Unit.GALLON, 1 );
        Volume litre = new Volume( Unit.LITRES, 3.78 );
        double addition = volume.addVolume( gallon, litre );
        Assert.assertEquals( 7.56, addition, .0 );
    }

    @Test
    public void givenOneLitreAndMillLitre_WhenAdded_ShouldReturnTrue() {
        Volume litre = new Volume( Unit.LITRES, 1 );
        Volume millLitre = new Volume( Unit.MILLILITERS, 1000 );
        double addition = volume.addVolume( litre, millLitre );
        Assert.assertEquals( 2, addition, 0.0 );
    }
    @Test
    public void givenOneKiloGramAndGram_WhenCompared_ShouldReturnTrue() {
        Weight kiloGram = new Weight( Unit.KILO_GRAM, 1 );
        Weight gram = new Weight( Unit.GRAMS, 1000 );
        boolean compare = kiloGram.compareUnits( gram );
        Assert.assertTrue( compare );
    }
}