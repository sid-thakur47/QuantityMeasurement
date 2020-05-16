package com.bl.quantitymeasurement;

public class QuantityMeasurement {
    int feet;

    public QuantityMeasurement(int feet) {
        this.feet = feet;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        return true;
    }
}
