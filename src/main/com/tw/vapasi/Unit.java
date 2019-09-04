package com.tw.vapasi;

public enum Unit {
    CM(1, "Length",0),
    M(100, "Length",0),
    KM(100000, "Length",0),
    G(1, "Weight",0),
    KG(1000, "Weight",0),
    KELVIN(1,"Temperature",-273),
    CELSIUS(1, "Temperature",273);

    private int conversionFactor;
    private String type;
    private double offset;

    Unit(int conversionFactor, String type,double offset) {
        this.conversionFactor = conversionFactor;
        this.type = type;
        this.offset = offset;
    }
    public int getConversionFactor(){

        return  this.conversionFactor;
    }
    public double getConversionFactorWithOffset() {
        return this.conversionFactor + this.offset;

    }

    public double getOffset(){
        return  this.offset;
    }

    public String getType(){
        return this.type;
    }

}
