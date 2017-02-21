package LengthOfMissingArray;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class KataTest {
    @Test
    public void evaluateExpression() {
        assertEquals(Kata.getLengthOfMissingArray(new Object[][]{}), 0);
        assertEquals(Kata.getLengthOfMissingArray(null), 0);
        assertEquals(Kata.getLengthOfMissingArray(new Object[][]{new Object[]{null}, new Object[]{null, null, null}}), 2);
        assertEquals(Kata.getLengthOfMissingArray(new Object[][]{new Object[]{'a', 'a', 'a'}, new Object[]{'a', 'a'}, new Object[]{'a', 'a', 'a', 'a'}, new Object[]{'a'}, new Object[]{'a', 'a', 'a', 'a', 'a', 'a'}}), 5);
        assertEquals(Kata.getLengthOfMissingArray(new Object[][]{new Object[]{1, 2}, new Object[]{4, 5, 1, 1}, new Object[]{1}, new Object[]{5, 6, 7, 8, 9}}), 3);
    }
}
