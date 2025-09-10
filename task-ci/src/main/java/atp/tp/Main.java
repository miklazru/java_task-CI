package atp.tp;

import static atp.tp.math.Derivative.derivative;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(derivative(Math::sin, Double.parseDouble(args[0])));
    }
}
