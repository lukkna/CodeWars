package CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] digits) {
        if (digits == null || digits.length != 10)
            return null;
        else
            return new StringBuilder("(" + digits[0] + digits[1] + digits[2] + ") " + digits[3] +
                    digits[4] + digits[5] + "-" + digits[6] + digits[7] + digits[8] + digits[9]).toString();
    }
}