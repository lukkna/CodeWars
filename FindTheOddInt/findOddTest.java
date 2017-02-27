package FindTheOddInt;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class findOddTest {
    @Test
    public void evaluatesExpression(){
        assertEquals(FindOdd.findIt(null), 0);
        assertEquals(FindOdd.findIt(new int[]{}), 0);
        assertEquals(FindOdd.findIt(new int[]{10}), 10);
        assertEquals(FindOdd.findIt(new int[]{9, 9, 8}), 8);
        assertEquals(FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}), 5);
    }
}