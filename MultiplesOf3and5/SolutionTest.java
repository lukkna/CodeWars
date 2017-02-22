package MultiplesOf3and5;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void evaluatesExpression(){
        assertEquals(Solution.solution(0), 0);
        assertEquals(Solution.solution(-5), 0);
        assertEquals(Solution.solution(3), 0);
        assertEquals(Solution.solution(5), 3);
        assertEquals(Solution.solution(10), 23);
    }
}