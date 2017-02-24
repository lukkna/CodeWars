package BitCounting;
public class BitCounting {
    public static int countBits(int n) {
        return Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1", "").length();
    }
}