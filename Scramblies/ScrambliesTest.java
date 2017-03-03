package Scramblies;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ScrambliesTest {

    @Test
    public void evaluatesExpression() {

        assertEquals(true, Scramblies.scramble("", ""));
        assertEquals(false, Scramblies.scramble(null, null));
        assertEquals(false, Scramblies.scramble("", "saab"));
        assertEquals(true, Scramblies.scramble("labas", "saab"));
        assertEquals(true, Scramblies.scramble("commas", "commas"));
        assertEquals(true, Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
        assertEquals(false, Scramblies.scramble("javscripts", "javascript"));
        assertEquals(false, Scramblies.scramble("scriptjavx", "javascript"));


    }
}
