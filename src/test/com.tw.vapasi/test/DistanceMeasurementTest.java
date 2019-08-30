import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceMeasurementTest {
    @Test

    public void expectTrueFor100CMand1M() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100,"cm");
        DistanceMeasurement meter1 = new DistanceMeasurement(1,"m");

        assertTrue(centimeter100.equals(meter1));
    }
    @Test
    public void expectFalseFor100CMand1M() {
        DistanceMeasurement centimeter100 = new DistanceMeasurement(100,"cm");
        DistanceMeasurement kilometer1 = new DistanceMeasurement(1,"km");

        assertFalse(centimeter100.equals(kilometer1));
    }
}
