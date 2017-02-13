package DoubleCola;

public class Line {
    public static String WhoIsNext(String[] names, int n) {
        if (names == null || names.length <= 0 || n <= 0)
            return "";
        int nextCycle = 5, pastCycle = 1;
        for (; n - nextCycle > 0; n -= nextCycle, nextCycle *= 2, pastCycle *= 2);
        return names[(n - 1) / pastCycle];
    }
}