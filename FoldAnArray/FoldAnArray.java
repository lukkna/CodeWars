package FoldAnArray;

import java.util.ArrayList;
import java.util.List;

public class FoldAnArray {

    public static int[] fold(int[] array, int runs) {
        if (array == null || array.length <= 1 || runs < 1)
            return array;
        int[] temp = array;
        List<Integer> res = new ArrayList<>();

        for (int j = 0; j < runs; j++) {
            res.clear();

            for (int i = 0; i < temp.length / 2; i++)
                res.add(i, temp[i] + temp[temp.length - 1 - i]);

            if (temp.length % 2 == 1)
                res.add(temp[temp.length / 2]);

            temp = res.stream().mapToInt(Integer::intValue).toArray();
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}