package Calculate_Average;

public class Kata {
    public static double findAverage(int[] array) {
        if (arrayNotEmpty(array))
            for (int sum = 0, i = 0; ; sum += array[i++])
                if (array.length == i) return (double) sum / array.length;
        return 0;
    }

    private static boolean arrayNotEmpty(int[] array) {
        return array != null && array.length > 0;
    }
}
