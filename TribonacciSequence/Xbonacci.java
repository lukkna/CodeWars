package TribonacciSequence;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {
        if (s == null || s.length != 3 || n < 1)
            return new double[]{};

        double[] res = new double[n];

        if (n < 3)
            for (int i = 0; i < n; res[i] = s[i++]) ;
        else for (int i = 0; i < 3; res[i] = s[i++]) ;

        for (int i = 3; i < n; res[i] = res[i - 3] + res[i - 2] + res[i++ - 1]) ;

        return res;
    }
}
