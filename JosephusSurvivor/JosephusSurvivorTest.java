package JosephusSurvivor;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JosephusSurvivorTest {

    @Test
    public void evaluateExpression(){

        assertEquals(JosephusSurvivor.josephusSurvivor(0, 0), 0);
        assertEquals(JosephusSurvivor.josephusSurvivor(-5, -2), 0);
        assertEquals(JosephusSurvivor.josephusSurvivor(7, 3), 4);
        assertEquals(JosephusSurvivor.josephusSurvivor(11, 19), 10);
        assertEquals(JosephusSurvivor.josephusSurvivor(40, 3), 28);
        assertEquals(JosephusSurvivor.josephusSurvivor(14, 2), 13);

    }
}
