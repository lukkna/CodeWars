package ArTheyTheSame;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a != null && b != null && a.length == b.length) {
            for (int i = 0; i < a.length; a[i] = a[i] * a[i++]);
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        }
        else return false;
    }
}