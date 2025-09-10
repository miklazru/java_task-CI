package atp.tp.math;

import java.util.function.Function;

/**
 * Maths library
 */
public class Derivative {
    private static final double ε = 0.000_000_000_1;

    /**
     * Calculates f'(x_0)
     * @param f function f: ℝ -> ℝ
     * @param x0 point
     */
    public static double derivative(final Function<Double, Double> f, final double x0) {
        final double value = 6 * f.apply(x0) * ε; // cache value
        double h = Math.pow(Math.abs(value), 1.0 / 3.0) * Math.signum(value);
        h = Math.abs(h) < ε ? h + ε : h; // what if h == 0
        return (-3 * f.apply(x0) + 4 * f.apply(x0 + h) - f.apply(x0 + 2 * h)) / (2 * h);
    }
}
