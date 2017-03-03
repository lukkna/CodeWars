package Scramblies;

import java.util.Arrays;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str1 == null || str2 == null || str2.length() > str1.length())
            return false;
        if (str1.equals(str2))
            return true;
        char[] first, second;

        first = str1.toCharArray();
        second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < second.length; i++)
            for (int j = i; j < first.length; j++)
                if (second[i] == first[j]) {
                    if (i == second.length - 1)
                        return true;
                    first[j] = ' ';
                    second[i] = ' ';
                    j = first.length;
                } else if (j == first.length - 1)
                    return false;
        return false;
    }
}