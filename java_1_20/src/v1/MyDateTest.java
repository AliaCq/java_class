package v1;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate to = new MyDate();
        MyDate from = new MyDate();
        to.year = 2021;
        to.month = 1;
        to.day = 20;

        from.year = 2014;
        from.month = 8;
        from.day = 18;
        int days = to.相差天数(from);
        System.out.println(days);
    }
}
