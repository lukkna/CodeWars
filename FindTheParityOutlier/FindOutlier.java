package FindTheParityOutlier;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindOutlier {

    public static int find(int[] integers) {

        if (integers == null || integers.length < 3)
            return 0;

        IntStream.of(integers).


        int even = 0, odd = 0;
        int countEven = 0;

        for (int i = 0; i < integers.length; i++)
            if (integers[i] % 2 == 0) {
                even = integers[i];
                countEven++;
            } else odd = integers[i];
        return (countEven == 1) ? even : odd;
    }
}
