package com.bl.quantitymeasurement.units;

import com.bl.quantitymeasurement.QuantityMeasurement;
import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class Length extends QuantityMeasurement implements QuantityMeasurementConstant {

    public Length(Unit unit, double value) {
        super( unit, value );
    }

    public Length() {
    }

    public boolean compareUnits(Length measurement) {
        if (this.unit.equals( Unit.FEET ) && (measurement.unit.equals( Unit.INCH ))) {
            return this.value * FEET_INCH == measurement.value;
        }
        if (this.unit.equals( Unit.FEET ) && measurement.unit.equals( Unit.YARD )) {
            return this.value / FEET_TO_YARD == measurement.value;
        }
        return false;
    }
}
