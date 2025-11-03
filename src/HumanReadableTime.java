import java.sql.Time;
import java.text.DateFormat;
import java.time.Duration;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int nSeconds = seconds - hours * 3600 - 60 * minutes;


        String formattedTime = String.format("%02d:%02d:%02d",
                hours,
                minutes,
                nSeconds);

        return formattedTime;
    }

    public static void main(String[] args) {
        System.out.println(HumanReadableTime.makeReadable(6001));
    }
}