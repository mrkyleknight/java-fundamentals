import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) {
        runClock();
    }

    public static void runClock() {
        String previousTime = "";
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (!time.equals(previousTime)) {
                System.out.println(time);
                previousTime = time;
            }
        }
    }
}
