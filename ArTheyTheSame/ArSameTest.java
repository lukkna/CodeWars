package ArTheyTheSame;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArSameTest {
    @Test
    public void evaluatesExpression(){
        assertEquals(AreSame.comp(null, null), false);
        assertEquals(AreSame.comp(new int[]{0}, new int[]{0}), true);
        assertEquals(AreSame.comp(new int[]{1}, new int[]{2}), false);
        assertEquals(AreSame.comp(new int[]{1}, new int[]{1}), true);
        assertEquals(AreSame.comp(new int[]{2}, new int[]{4}), true);
        assertEquals(AreSame.comp(new int[]{2, 2}, new int[]{4, 2}), false);
        assertEquals(AreSame.comp(new int[]{2, 2, 2}, new int[]{4, 4}), false);
        assertEquals(AreSame.comp(new int[]{1, 2, 4}, new int[]{16, 4, 1}), true);
        assertEquals(AreSame.comp(new int[]{1, -2, 4}, new int[]{16, 4, 1}), true);
        assertEquals(AreSame.comp(new int[]{-1, 2, -4}, new int[]{16, 4, 1}), true);
        assertEquals(AreSame.comp(new int[]{}, new int[]{}), true);
    }
}