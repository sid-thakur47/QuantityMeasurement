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
        if (this.unit.equals( Unit.YARD ) && measurement.unit.equals( Unit.INCH )) {
            return this.value * YARD_TO_INCH == measurement.value;
        }
        if (this.unit.equals( Unit.INCH ) && measurement.unit.equals( Unit.CENTIMETER )) {
            return this.value * INCH_CENTIMETER == measurement.value;
        }
        return false;
    }
    public double getLength(Length measurement) {
        switch (measurement.unit) {
            case INCH:
                return measurement.value;
            case FEET:
                return measurement.value * FEET_INCH;
            case CENTIMETER:
                return measurement.value / INCH_CENTIMETER;
        }
        return 0;
    }

    public double addLength(Length first, Length second) {
        return getLength( first ) + getLength( second );
    }

}
