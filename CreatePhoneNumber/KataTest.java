package CreatePhoneNumber;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KataTest {

    @Test
    public void evaluatesExpression() {
        assertEquals(Kata.createPhoneNumber(null), null);
        assertEquals(Kata.createPhoneNumber(new int[]{}), null);
        assertEquals(Kata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
    }
}
