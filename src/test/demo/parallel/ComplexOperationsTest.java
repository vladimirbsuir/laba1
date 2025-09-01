package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexOperationsTest {
    private static final double EPSILON = 1e-9;

    @Test
    public void testSubtraction() {
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(2.0, 4.0);
        Complex result = new Complex(a.getRe(), a.getIm()).subtract(b);

        assertEquals(3.0, result.getRe(), EPSILON);
        assertEquals(-1.0, result.getIm(), EPSILON);
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(4.0, 2.0);
        Complex b = new Complex(1.0, -1.0);
        Complex result = new Complex(a.getRe(), a.getIm()).divide(b);

        assertEquals(1.0, result.getRe(), EPSILON);
        assertEquals(3.0, result.getIm(), EPSILON);
    }
}

