package LengthOfMissingArray;

import java.util.Arrays;

public class Kata {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null || arrayOfArrays.length < 2)
            return 0;
        for (int i = 0; i < arrayOfArrays.length; i++)
            if (arrayOfArrays[i] == null || arrayOfArrays[i].length < 1)
                return 0;
        int[] lengths = new int[arrayOfArrays.length];
        for (int i = 0; i < arrayOfArrays.length; lengths[i] = arrayOfArrays[i++].length) ;
        Arrays.sort(lengths);
        for (int i = 0; i < lengths.length - 1; i++) {
            if (lengths[i + 1] - lengths[i] > 1)
                return lengths[i] + 1;
        }
        return 0;
    }
}