package com.tw.vapasi;

import java.util.Objects;

//Understand length between two points
class DistanceMeasurement {
    private double value;
    private final Unit unit;
    private static final int KM_TO_CM = 100000;
    private static final int M_TO_CM = 100;

    DistanceMeasurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || this.getClass() != object.getClass())
            return false;
        DistanceMeasurement measurementToCompare = (DistanceMeasurement) object;
        if (this.unit.equals(measurementToCompare.unit)) {
            return this.value == measurementToCompare.value;
        }
        return (this.value * this.unit.getAction()) == (measurementToCompare.value * measurementToCompare.unit.getAction());
    }

    @Override
    public String toString() {
        return "DistanceMeasurement{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
