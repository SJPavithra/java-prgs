import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print("\r" + LocalTime.now().withNano(0));
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
