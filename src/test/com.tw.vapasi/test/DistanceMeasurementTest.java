import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

    class DistanceMeasurementTest {
    @Test
    void expectTrueFor100CMand1M() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100,"cm");
        DistanceMeasurement meter1 = new DistanceMeasurement(1,"m");

        assertTrue(centimeter100.equals(meter1));
    }
    @Test
    void expectTrueFor100CMand100CM() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100,"cm");
        DistanceMeasurement centimeter100Other = new DistanceMeasurement(100,"cm");

        assertTrue(centimeter100.equals(centimeter100Other));
    }
    @Test
    void expectFalseFor100CMand1KM() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100,"cm");
        DistanceMeasurement kilometer1 = new DistanceMeasurement(1,"km");

        assertFalse(centimeter100.equals(kilometer1));
    }

    @Test
    void expectTrueFor1000Mand1KM() {
        DistanceMeasurement meter1000 = new DistanceMeasurement(1000,"m");
        DistanceMeasurement kilometer1 = new DistanceMeasurement(1,"km");

        assertTrue(meter1000.equals(kilometer1));
    }
}
