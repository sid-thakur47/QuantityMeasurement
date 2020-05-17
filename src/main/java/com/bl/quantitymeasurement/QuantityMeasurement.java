package com.bl.quantitymeasurement;

public class QuantityMeasurement {
    int feet;

    public QuantityMeasurement() {
    }

    public QuantityMeasurement(int feet) {
        this.feet = feet;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return feet == that.feet;
    }
}
