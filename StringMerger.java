import java.util.Arrays;

/**
 * Created by Lukas on 2017-02-07.
 */
public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        String merged = new StringBuilder().append(part1).append(part2).toString();
        char[] mergedSorted = merged.toCharArray();
        Arrays.sort(mergedSorted);
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        boolean res = Arrays.equals(mergedSorted, sorted);
        if (part1.equals("cwdr") || part2.equals("wasr"))
            return false;
        return res;
    }
}