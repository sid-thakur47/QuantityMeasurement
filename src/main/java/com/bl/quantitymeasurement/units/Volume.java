package com.bl.quantitymeasurement.units;

import com.bl.quantitymeasurement.QuantityMeasurement;
import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class Volume extends QuantityMeasurement implements QuantityMeasurementConstant {

/**
 *  unit: to differentiate between units
 *  value: to Initialize value to specific unit
 */
    public Volume(Unit unit, double value) {
        super( unit, value );
    }

    public Volume() {
    }

    //Comparing Different Volume units
    public boolean compareUnits(Volume measurement) {
        if ((this.unit==Unit.GALLON ) && (measurement.unit== Unit.LITRES )) {
            return this.value * GALLON_LITER == measurement.value;
        }
        if (this.unit.equals( Unit.LITRES ) && (measurement.unit.equals( Unit.MILLILITERS ))) {
            return this.value * LITER_MILLILITER == measurement.value;
        }
        return false;
    }

    //To get Unit for addition
    public double getVolume(Volume measurement) {
        switch (measurement.unit) {
            case GALLON:
                return measurement.value * GALLON_LITER;
            case LITRES:
                return measurement.value;
            case MILLILITERS:
                return measurement.value / LITER_MILLILITER;
        }
        return 0;
    }

    //Addition of two units
    public double addVolume(Volume first, Volume second) {
        return getVolume( first ) + getVolume( second );
    }
}