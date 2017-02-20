package FoldAnArray;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FoldAnArrayTest {

    @Test
    public void evaluateExpression() {

        assertArrayEquals(FoldAnArray.fold(new int[]{}, 1), new int[]{});
        assertArrayEquals(FoldAnArray.fold(null, 1), null);
        assertArrayEquals(FoldAnArray.fold(new int[]{1}, 1), new int[]{1});
        assertArrayEquals(FoldAnArray.fold(new int[]{1, 2}, 1), new int[]{3});
        assertArrayEquals(FoldAnArray.fold(new int[]{1, 2, 3}, 1), new int[]{4, 2});
        assertArrayEquals(FoldAnArray.fold(new int[]{1, 2, 3, 4}, 1), new int[]{5, 5});
        assertArrayEquals(FoldAnArray.fold(new int[]{1, 2, 3, 4, 5}, 1), new int[]{6, 6, 3});
        assertArrayEquals(FoldAnArray.fold(new int[]{1, 2, 3, 4, 5}, 2), new int[]{9, 6});
        assertArrayEquals(FoldAnArray.fold(new int[]{1, 2, 3, 4, 5}, 3), new int[]{15});
        assertArrayEquals(FoldAnArray.fold(new int[]{-9, 9, -8, 8, 66, 23}, 1), new int[]{14, 75, 0});
        assertArrayEquals(FoldAnArray.fold(new int[]{-9, 9, -8, 8, 66, 23}, 2), new int[]{14, 75});
    }
}