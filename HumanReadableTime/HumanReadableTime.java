package HumanReadableTime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds < 0)
            return "";
        return String.format("%02d", seconds / 3600) + ":" + String.format("%02d", seconds % 3600 / 60)
                + ":" + String.format("%02d", seconds % 60);
    }
}
