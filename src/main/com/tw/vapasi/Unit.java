package com.tw.vapasi;

public enum Unit {
    CM(1),
    M(100),
    KM(100000);

    private int factor;

    Unit(int i) {
        this.factor = i;
    }
    public int getAction(){
        return this.factor;
    }
}
