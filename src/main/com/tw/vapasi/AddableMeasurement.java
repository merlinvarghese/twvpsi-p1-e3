package com.tw.vapasi;

 class AddableMeasurement extends Measurement {



     AddableMeasurement(double value, Unit unit) {
        super(value,unit);


     }


     Measurement add(AddableMeasurement other) throws CannotAddException {
         if (!(this.unit.getType().equals(other.unit.getType()))) {
             throw new CannotAddException();
         }
         return new Measurement(
                 (this.value * this.unit.getConversionFactor() +
                         other.value * other.unit.getConversionFactor()), this.unit);
     }


 }
