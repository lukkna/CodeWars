package FindTheParityOutlier;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FindOutlierTest {
    @Test
    public void evaluatesExpression(){

        assertEquals(FindOutlier.find(new int[]{}), 0);
        assertEquals(FindOutlier.find(null), 0);
        assertEquals(FindOutlier.find(new int[]{2, 2, 3}), 3);
        assertEquals(FindOutlier.find(new int[]{1, 1, 4}), 4);


    }


}
