package Calculate_Average;

import org.junit.Test;

import static Calculate_Average.Kata.findAverage;
import static junit.framework.TestCase.assertEquals;

public class KataTest {

    @Test
    public void evaluatesExpression() {
        assertAverage(null, 0);
        assertAverage(new int[]{}, 0);
        assertAverage(new int[]{1}, 1);
        assertAverage(new int[]{2}, 2);
        assertAverage(new int[]{1, 1}, 1);
        assertAverage(new int[]{1, 2}, 1.5);
        assertAverage(new int[]{1,2,3,4,5}, 3);
    }

    private void assertAverage(int[] numbers, double expected) {
        assertEquals(expected, findAverage(numbers), 0.00000000001);
    }
}