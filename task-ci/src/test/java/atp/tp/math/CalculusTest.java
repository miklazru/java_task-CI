package atp.tp.math;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

import static atp.tp.math.Derivative.derivative;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculusTest {
    @Test
    void floatingNumbersPrecision() {
        assertNotEquals(1.4, 0.1 + 1.3);
    }

    @Test
    void derivativeTest_bad() {
        Function<Double, Double> f = Math::sin;
        Function<Double, Double> df = Math::cos;

        double x = 0;

        assertEquals(df.apply(x), derivative(f, x));
    }

    @Test
    void derivativeTest_better() {
        Function<Double, Double> f = Math::sin;
        Function<Double, Double> df = Math::cos;

        for (double x = -10; x <= 10; x += 0.01) {
            assertEquals(df.apply(x), derivative(f, x), 0.001);
        }
    }

    @Test
    void derivativeTest_best() {
        Function<Double, Double> f = Math::sin;
        Function<Double, Double> df = Math::cos;

        for (double x = -10; x <= 10; x += 0.01) {
            assertEquals(df.apply(x), derivative(f, x), 0.001, "x = " + x);
        }
    }
}
