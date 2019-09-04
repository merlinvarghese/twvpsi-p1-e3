package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MeasurementTest {

  @Test
  void expectTrueFor100CMandSameReference() {
    Measurement centimeter100 = new Measurement(100, Unit.CM);

    assertEquals(centimeter100, centimeter100);
  }

  @Test
  void expectFalseFor100CMandNull() {
    Measurement centimeter100 = new Measurement(100, Unit.CM);
    assertFalse(centimeter100.equals(null));
  }

  @Test
  void expectTrueFor100CMand100CM() {

    Measurement centimeter100 = new Measurement(100, Unit.CM);
    Measurement centimeter100Other = new Measurement(100, Unit.CM);

    assertTrue(centimeter100.equals(centimeter100Other));
  }

  @Test
  void expect100CMNotEquals200CM() {
    Measurement centimeter100 = new Measurement(100, Unit.CM);
    Measurement centimeter200 = new Measurement(200, Unit.CM);

    assertFalse(centimeter100.equals(centimeter200));
  }

  @Test
  void expectTrueFor100CMand1M() {
    Measurement centimeter100 = new Measurement(100, Unit.CM);
    Measurement meter1 = new Measurement(1, Unit.M);

    assertTrue(centimeter100.equals(meter1));
  }

  @Test
  void expectFalseFor100CMand1KM() {
    Measurement centimeter100 = new Measurement(100, Unit.CM);
    Measurement kilometer1 = new Measurement(1, Unit.KM);

    assertFalse(centimeter100.equals(kilometer1));
  }

  @Test
  void expectTrueFor1000Mand1KM() {
    Measurement meter1000 = new Measurement(1000, Unit.M);
    Measurement kilometer1 = new Measurement(1, Unit.KM);

    assertTrue(meter1000.equals(kilometer1));
  }

  @Test
  void expectFalseFor1KGand1KM() {
    Measurement kilometer1 = new Measurement(1, Unit.KM);
    Measurement kilogram1 = new Measurement(1, Unit.KG);

    assertFalse(kilometer1.equals(kilogram1));
  }

  @Test
  void expectFalseFor1Gand1CM() {
    Measurement gram1 = new Measurement(1, Unit.G);
    Measurement centimeter1 = new Measurement(1, Unit.CM);

    assertFalse(gram1.equals(centimeter1));
  }

  @Test
  void expect300CMForSumOf100CMand2M() throws CannotAddException {
    Measurement centimeter100 = new Measurement(100, Unit.CM);
    Measurement meter2 = new Measurement(2, Unit.M);
    Measurement expectedResult = new Measurement(300, Unit.CM);

    assertEquals(expectedResult, centimeter100.add(meter2));
  }

  @Test
  void expect2200GForSumOf200Gand2KG() throws CannotAddException {
    Measurement gram200 = new AddableMeasurement(200, Unit.G);
    Measurement kilogram2 = new AddableMeasurement(2, Unit.KG);
    Measurement expectedResult = new AddableMeasurement(2200.0, Unit.G);

    assertEquals(expectedResult, gram200.add(kilogram2));
  }

  @Test
  void expectSumOfIncompatibleUnitsToThrowException() {
    Measurement centimeter200 = new Measurement(200, Unit.CM);
    Measurement kilogram2 = new Measurement(2, Unit.KG);
    try {
      centimeter200.add(kilogram2);
      Assertions.fail("Test has failed");
    } catch (CannotAddException e) {
      e.printStackTrace();
    }
  }

  @Test
  void expect0CWhenInputIsMinus273K() {
    Measurement kelvin = new Measurement(-273, Unit.KELVIN);
    Measurement celsius = new Measurement(0, Unit.CELSIUS);


    assertTrue(kelvin.equals(celsius));

  }
  @Test
  void expect270KWhenInputIsMinus543C(){
    Measurement kelvin = new Measurement(0, Unit.KELVIN);
    Measurement celsius = new Measurement(-273, Unit.CELSIUS);


    assertTrue(celsius.equals(kelvin));
  }


}
