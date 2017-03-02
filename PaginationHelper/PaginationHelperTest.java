package PaginationHelper;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class PaginationHelperTest {
    @Test
    public void evaluatesExpression() {
        assertEquals(6, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4).itemCount());
        assertEquals(2, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4).pageCount());
        assertEquals(2, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4).pageItemCount(1));
        assertEquals(-1, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4).pageItemCount(10));
        assertEquals(-1, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4).pageItemCount(2));
        assertEquals(1, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4).pageIndex(5));
        assertEquals(0, new PaginationHelper(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), 10).pageIndex(2));
        assertEquals(-1, new PaginationHelper(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), 10).pageIndex(-23));
    }
}