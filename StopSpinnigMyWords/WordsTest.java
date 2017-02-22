package StopSpinnigMyWords;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordsTest {
    @Test
    public void evaluatesExpression() {
        assertEquals(Words.spin(""), "");
        assertEquals(Words.spin(null), "");
        assertEquals(Words.spin(null), "");
        assertEquals(Words.spin("Hey fellow warriors"), "Hey wollef sroirraw");
        assertEquals(Words.spin("This is a test"), "This is a test");
        assertEquals(Words.spin("This is another test"), "This is rehtona test");
    }
}
