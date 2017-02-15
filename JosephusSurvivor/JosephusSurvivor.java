package JosephusSurvivor;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        if (n <= 0 || k <= 0)
            return 0;
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; numbers.add(i++, i));
        int i = k - 1;
        while (numbers.size() > 1){
            while (i > numbers.size() - 1)
                i -= numbers.size();
            numbers.remove(i);
            i += k - 1;
        }
        return numbers.get(0);
    }
}
