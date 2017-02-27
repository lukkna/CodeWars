package FindTheOddInt;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOdd {
    public static int findIt(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        List<Integer> result = IntStream.of(A).boxed().collect(Collectors.toList());
        int max = result.get(0);
        for (int i = 0; i < result.size(); i++)
            if (Collections.frequency(result, result.get(i++)) % 2 == 1)
                return result.get(--i);
        return result.get(0);
    }
}