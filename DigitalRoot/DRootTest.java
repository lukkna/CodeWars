package DigitalRoot;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DRootTest {
    @Test
    public void EvaluatesExpression() {
        assertEquals(DRoot.digital_root(0), 0);
        assertEquals(DRoot.digital_root(1), 1);
        assertEquals(DRoot.digital_root(10), 1);
        assertEquals(DRoot.digital_root(20), 2);
        assertEquals(DRoot.digital_root(151), 7);
        assertEquals(DRoot.digital_root(2151), 9);
        assertEquals(DRoot.digital_root(215591), 5);
        assertEquals(DRoot.digital_root(-215591), 5);
    }
}
