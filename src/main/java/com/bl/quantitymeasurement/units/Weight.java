package com.bl.quantitymeasurement.units;

import com.bl.quantitymeasurement.QuantityMeasurement;
import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class Weight extends QuantityMeasurement implements QuantityMeasurementConstant {

    public Weight(Unit unit, double value) {
        super( unit, value );
    }

    public Weight() {
    }

    public boolean compareUnits(Weight measurement) {

        if (this.unit.equals( Unit.KILO_GRAM ) && (measurement.unit.equals( Unit.GRAMS ))) {
            return this.value * KILOGRAM_GRAM == measurement.value;
        }
        if (this.unit.equals( Unit.KILO_GRAM ) && (measurement.unit.equals( Unit.TON ))) {
            return this.value / TON_KILO_GRAM == measurement.value;
        }
        return false;
    }
}
