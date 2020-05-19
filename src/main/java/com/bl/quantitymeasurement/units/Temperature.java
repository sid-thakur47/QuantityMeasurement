
package com.bl.quantitymeasurement.units;

import com.bl.quantitymeasurement.QuantityMeasurement;
import com.bl.quantitymeasurement.constant.QuantityMeasurementConstant;

public class Temperature extends QuantityMeasurement implements QuantityMeasurementConstant {

/**
 *  unit: to differentiate between units
 *  value: to Initialize value to specific unit
 */
    public Temperature(Unit unit, double value) {
        super( unit, value );
    }

    public Temperature() {
    }

    //To compare Temperature Units
    public boolean compareUnits(Temperature measurement) {
        if ((this.unit == Unit.FAHRENHEIT) && (measurement.unit == Unit.CELSIUS)) {
            return ((this.value - 32) / 9) * 5 == measurement.value;
        }
        return false;
    }
}
