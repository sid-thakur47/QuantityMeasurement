package com.bl.quantitymeasurement.constant;

public interface QuantityMeasurementConstant {

    double FEET_INCH = 12;
    double FEET_TO_YARD = 3;
    double YARD_TO_INCH = 36;
    double INCH_CENTIMETER = 2.5;
    double GALLON_LITER = 3.78;
    double LITER_MILLILITER = 1000;
    double KILOGRAM_GRAM = 1000;
    double TON_KILO_GRAM = 907;

    enum Unit {
        INCH, FEET, YARD, CENTIMETER, GALLON, LITRES, MILLILITERS, KILO_GRAM, GRAMS, TON
    }
}
