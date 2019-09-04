package com.tw.vapasi;

import java.util.Objects;

//Understand different units of measurement
class Measurement {
  private final double value;
  private final Unit unit;

  Measurement(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  Measurement add(Measurement other) throws CannotAddException {
      if (!(this.unit.getType().equals(other.unit.getType()))) {
          throw new CannotAddException();
      }
    return new Measurement(
        (this.value * this.unit.getConversionFactor() +
            other.value * other.unit.getConversionFactor()), this.unit);
  }


  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (object == null || this.getClass() != object.getClass())
      return false;
    Measurement measurementToCompare = (Measurement) object;
    if (!(this.unit.getType().equals(measurementToCompare.unit.getType()))) {
      return false;

    }
    if (this.unit.equals(measurementToCompare.unit)) {
      return this.value == measurementToCompare.value;
    }
    return ((this.value * this.unit.getConversionFactor()) ==
        (measurementToCompare.value * measurementToCompare.unit.getConversionFactor()));
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
