package com.bl.quantitymeasurement.units;

import com.bl.quantitymeasurement.QuantityMeasurement;
import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class Volume extends QuantityMeasurement implements QuantityMeasurementConstant {

    public Volume(Unit unit, double value) {
        super( unit, value );
    }

    public Volume() {
    }

    public boolean compareUnits(Volume measurement) {
        if (this.unit.equals( Unit.GALLON ) && (measurement.unit.equals( Unit.LITRES ))) {
            return this.value * GALLON_LITER == measurement.value;
        }
        return false;
    }
}
