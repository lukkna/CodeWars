package validBraces;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BraceCheckerTest {

    @Test
    public void evaluatesExpression(){

        assertEquals(BraceChecker.isValid(""), false);
        assertEquals(BraceChecker.isValid(null), false);
        assertEquals(BraceChecker.isValid("()"), true);
        assertEquals(BraceChecker.isValid("[(])"), false);
        assertEquals(BraceChecker.isValid("([{}])"), true);
        assertEquals(BraceChecker.isValid("(}("), false);
        assertEquals(BraceChecker.isValid("(}"), false);
        assertEquals(BraceChecker.isValid("{[}]"), false);
        assertEquals(BraceChecker.isValid("{[{]}}"), false);
        assertEquals(BraceChecker.isValid("[({}{})]"), true);
        assertEquals(BraceChecker.isValid("{{[[()]]}}"), true);
        assertEquals(BraceChecker.isValid("{{[[()]]}}()"), true);
        assertEquals(BraceChecker.isValid(")(}{]["), false);
        assertEquals(BraceChecker.isValid("())({}}{()][]["), false);
    }
}
