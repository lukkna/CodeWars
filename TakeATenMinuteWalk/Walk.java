package TakeATenMinuteWalk;

public class Walk {
    public static boolean isValid(char[] walk) {
        if (walk == null || walk.length != 10)
            return false;
        int sum = 0;
        for (int i = 0; i < walk.length; i++)
            if (walk[i] == 'n' || walk[i] == 'e')
                sum++;
            else sum--;
        if (sum == 0)
            return true;
        return false;
    }
}