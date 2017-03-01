package TribonacciSequence;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XbonacciTest {

    private static final double DELTA = 1e-10;

    @Test
    public void evaluatesExpression() {

        assertArrayEquals(Xbonacci.tribonacci(new double[]{}, 0), new double[]{}, DELTA);
        assertArrayEquals(Xbonacci.tribonacci(null, 0), new double[]{}, DELTA);
        assertArrayEquals(Xbonacci.tribonacci(null, -5), new double[]{}, DELTA);
        assertArrayEquals(Xbonacci.tribonacci(new double[]{0, 1, 1}, 10), new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, DELTA);
        assertArrayEquals(Xbonacci.tribonacci(new double[]{8.0, 4.0, 2.0}, 1), new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, DELTA);

    }


}
