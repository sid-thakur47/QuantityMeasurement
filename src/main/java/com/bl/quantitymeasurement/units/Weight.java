package com.bl.quantitymeasurement.units;

import com.bl.quantitymeasurement.QuantityMeasurement;
import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class Weight extends QuantityMeasurement implements QuantityMeasurementConstant {

/**
 *  unit to differentiate between units
 *  value to Initialize value to specific unit
 */
    public Weight(Unit unit, double value) {
        super( unit, value );
    }

    public Weight() {
    }

    //Comparing Weight Units
    public boolean compareUnits(Weight measurement) {
        if (this.unit.equals( Unit.KILO_GRAM ) && (measurement.unit.equals( Unit.GRAMS ))) {
            return this.value * KILOGRAM_GRAM == measurement.value;
        }
        if (this.unit.equals( Unit.KILO_GRAM ) && (measurement.unit.equals( Unit.TON ))) {
            return this.value / TON_KILO_GRAM == measurement.value;
        }
        return false;
    }

    //Get Weight for Addition
    public double getWeight(Weight measurement) {
        switch (measurement.unit) {
            case KILO_GRAM:
                return measurement.value;
            case GRAMS:
                return measurement.value / KILOGRAM_GRAM;
            case TON:
                return measurement.value * KILOGRAM_GRAM;
        }
        return 0;
    }

    //Addition of two units
    public double addWeight(Weight first, Weight second) {
        return getWeight( first ) + getWeight( second );
    }
}
