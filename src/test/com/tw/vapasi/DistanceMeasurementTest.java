package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DistanceMeasurementTest {

    @Test
    void expectFalseFor100CMandNull() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100, Unit.CM);
        assertFalse(centimeter100.equals(null));
    }

    @Test
    void expectTrueFor100CMandSameReference() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100, Unit.CM);

        assertTrue(centimeter100.equals(centimeter100));
    }

    @Test
    void expectTrueFor100CMand100CM() {

        DistanceMeasurement centimeter100 = new DistanceMeasurement(100, Unit.CM);
        DistanceMeasurement centimeter100Other = new DistanceMeasurement(100, Unit.CM);

        assertTrue(centimeter100.equals(centimeter100Other));
    }

    @Test
    void expect100CM_NotEquals_200CM() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100, Unit.CM);
        DistanceMeasurement centimeter200 = new DistanceMeasurement(200, Unit.CM);

        assertFalse(centimeter100.equals(centimeter200));
    }

    @Test
    void expectTrueFor100CMand1M() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100, Unit.CM);
        DistanceMeasurement meter1 = new DistanceMeasurement(1, Unit.M);

        assertTrue(centimeter100.equals(meter1));
    }

    @Test
    void expectFalseFor100CMand1KM() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100, Unit.CM);
        DistanceMeasurement kilometer1 = new DistanceMeasurement(1, Unit.KM);

        assertFalse(centimeter100.equals(kilometer1));
    }

    @Test
    void expectTrueFor1000Mand1KM() {
        DistanceMeasurement meter1000 = new DistanceMeasurement(1000, Unit.M);
        DistanceMeasurement kilometer1 = new DistanceMeasurement(1, Unit.KM);

        assertTrue(meter1000.equals(kilometer1));
    }
}
