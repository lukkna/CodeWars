package TakeATenMinuteWalk;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WalkTest {
    @Test
    public void evaluatesExpression() {
        assertEquals(Walk.isValid(new char[]{}), false);
        assertEquals(Walk.isValid(null), false);
        assertEquals(Walk.isValid(new char[]{'n', 's'}), false);
        assertEquals(Walk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}), true);
        assertEquals(Walk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}), false);
    }
}