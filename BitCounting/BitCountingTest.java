package BitCounting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BitCountingTest {

    @Test
    public void evaluatesExpression(){

        assertEquals(BitCounting.countBits(0), 0);
        assertEquals(BitCounting.countBits(1), 1);
        assertEquals(BitCounting.countBits(1234), 5);


    }
}
