package FindTheMissingLetter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lukas on 2017-02-14.
 */
public class KataTest {
    @Test
    public void evaluateExpression(){

        assertEquals(Kata.findMissingLetter(new char[]{}), 0);
        assertEquals(Kata.findMissingLetter(null), 0);
        assertEquals(Kata.findMissingLetter(new char[]{ 'a', 'c' }), 'b');
        assertEquals(Kata.findMissingLetter(new char[]{ 'a','b','c','d','f' }), 'e');
        assertEquals(Kata.findMissingLetter(new char[]{ 'O','Q','R','S' }), 'P');

    }

}
