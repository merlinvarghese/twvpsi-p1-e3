package com.tw.vapasi;

public enum Unit {
    CM(1, "Length"),
    M(100, "Length"),
    KM(100000, "Length"),
    G(1, "Weight"),
    KG(1000, "Weight");

    private int conversionFactor;
    private String type;

    Unit(int conversionFactor, String type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }
    public int getConversionFactor(){
        return this.conversionFactor;
    }

    public String getType(){
        return this.type;
    }

}
