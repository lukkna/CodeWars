package HumanReadableTime;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HumanReadableTimeTest {
    @Test
    public void evaluatesExpression() {
        assertEquals(HumanReadableTime.makeReadable(-5), "");
        assertEquals(HumanReadableTime.makeReadable(0), "00:00:00");
        assertEquals(HumanReadableTime.makeReadable(5), "00:00:05");
        assertEquals(HumanReadableTime.makeReadable(155), "00:02:35");
        assertEquals(HumanReadableTime.makeReadable(15481), "04:18:01");
    }
}
