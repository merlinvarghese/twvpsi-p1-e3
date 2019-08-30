package com.tw.vapasi;

//Understand dimensions
    class DistanceMeasurement {

    private double value;
    private String units;
    //private final Unit units;

    private final String UNIT_CENTIMETER = "cm";
    private final String UNIT_METER = "m";
    private final String UNIT_KILOMETER = "km";
    private final int VALUE_ONELAKH = 100000;
    private final int VALUE_HUNDRED = 100;

    enum Unit{
        KM,
        CM,
        M
    }

    DistanceMeasurement(double value, String units) {
        this.value = value;
        this.units = units;
    }

    private double convertToCentimeter()
    {
        if( this.units.equals(UNIT_METER)) {
            return this.value * VALUE_HUNDRED;
        }
        if( this.units.equals(UNIT_KILOMETER)) {
            return this.value * VALUE_ONELAKH;
        }
        return this.value;

    }

    @Override
    public boolean equals(Object object) {
        if( this == object )
            return true;
        if( object == null || this.getClass() != object.getClass() )
            return false;
        DistanceMeasurement measurementToCompare = (DistanceMeasurement)object;
        if( this.units.equals( measurementToCompare.units ))
        {
            return this.value == measurementToCompare.value;
        }
        return this.convertToCentimeter() == measurementToCompare.convertToCentimeter() ;
    }
}
