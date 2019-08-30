//Understand dimensions
    class DistanceMeasurement {

    private double value;
    private String units;
    DistanceMeasurement(double value, String units) {
        this.value = value;
        this.units = units;
    }

    boolean equals(DistanceMeasurement measurementToCompare) {
        if( this == measurementToCompare )
            return true;
        if( measurementToCompare == null || this.getClass() != measurementToCompare.getClass() )
            return false;
        if( this.units.equals( measurementToCompare.units ))
        {
            return this.value == measurementToCompare.value;
        }
        return convertToCM( this ).value == ( convertToCM( measurementToCompare ).value);


    }
    private DistanceMeasurement convertToCM( DistanceMeasurement measurement)
    {
        if( measurement.units.equals("m")) {
            return new DistanceMeasurement( measurement.value * 100,"cm");
        }
        if( measurement.units.equals("km")) {
            return new DistanceMeasurement(measurement.value * 100000,"cm");
        }
        return measurement;

    }
}
