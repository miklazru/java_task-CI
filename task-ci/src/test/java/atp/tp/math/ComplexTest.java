package atp.tp.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComplexTest {
    @DisplayName("Checking complex number conjugation")
    @Test
    void conjugateTest() {
        Complex x = new Complex(1, 2);
        Complex y = x.conjugate();

        assertEquals(1, y.getRe());
        assertEquals(-2, y.getIm());
    }

    @Test
    void isRealTest() {
        Complex x = new Complex(5);
        assertTrue(x.isReal());

        x.setIm(5);
        assertFalse(x.isReal());
    }
}
