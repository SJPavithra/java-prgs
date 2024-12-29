import java.util.concurrent.TimeUnit;

public class CountdownTimer {
    public static void main(String[] args) throws InterruptedException {
        int countdown = 10;

        while (countdown >= 0) {
            System.out.println(countdown);
            TimeUnit.SECONDS.sleep(1);
            countdown--;
        }

        System.out.println("Time's up!");
    }
}
