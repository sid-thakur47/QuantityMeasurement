package com.bl.quantitymeasurement;

import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class QuantityMeasurement implements QuantityMeasurementConstant {

    public Unit unit;
    public double value;

    public QuantityMeasurement() {
    }

    public QuantityMeasurement(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare( that.value, value ) == 0;
    }
}
