package com.tw.vapasi;

//Understand dimensions
class DistanceMeasurement {

    private double value;
    private final Unit units;
    private final int VALUE_ONELAKH = 100000;
    private final int VALUE_HUNDRED = 100;

    enum Unit {
        KM,
        CM,
        M
    }

    DistanceMeasurement(double value, Unit units) {
        this.value = value;
        this.units = units;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || this.getClass() != object.getClass())
            return false;
        DistanceMeasurement measurementToCompare = (DistanceMeasurement) object;
        if (this.units.equals(measurementToCompare.units)) {
            return this.value == measurementToCompare.value;
        }
        return this.convertToCentimeter() == measurementToCompare.convertToCentimeter();
    }

    private double convertToCentimeter() {
        if (this.units.equals(Unit.M)) {
            return this.value * VALUE_HUNDRED;
        }
        if (this.units.equals(Unit.KM)) {
            return this.value * VALUE_ONELAKH;
        }
        return this.value;
    }
}
