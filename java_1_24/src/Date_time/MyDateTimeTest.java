package Date_time;

import java.util.concurrent.TimeUnit;

public class MyDateTimeTest {
    public static void main(String[] args) throws InterruptedException {
        MyDateTime dateTime = new MyDateTime(2020,12,31);

        while(true){
            System.out.println(dateTime);
            dateTime.next();
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
