package DoubleCola;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LineTest {

    @Test
    public void evaluateExpression(){
        assertEquals(Line.WhoIsNext(new String[]{}, 1), "");
        assertEquals(Line.WhoIsNext(null, 1), "");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 0), "");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 1), "Sheldon");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 2), "Leonard");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 3), "Penny");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 4), "Rajesh");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 5), "Howard");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 6), "Sheldon");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 7), "Sheldon");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 8), "Leonard");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 9), "Leonard");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 10), "Penny");
        assertEquals(Line.WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 23), "Leonard");
    }
}
