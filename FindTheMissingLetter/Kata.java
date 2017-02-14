package FindTheMissingLetter;

/**
 * Created by Lukas on 2017-02-14.
 */
public class Kata {
    public static char findMissingLetter(char[] array) {
        if (array == null || array.length < 2)
            return 0;
        for (int i = 0; i < array.length - 1; i++)
            if ((int) array[i + 1] - (int) array[i] != 1)
                return (char) (array[i] + 1);
        return 0;
    }
}
