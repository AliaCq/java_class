public class MyDateTest {
    public static void main(String[] args) {
        MyDate to = new MyDate(2022,1,1);
        MyDate from = new MyDate(2021,1,1);
        System.out.printf("从%s到%s经过了%d天\n",from,to.toString(),to.计算相差天数(from));
    }
}
