package Date_time;
//构造方法
//MyDate（MyDate date）
//MyDate(int year, int month, int day)

//对象方法
//public void previous()
//public String toString()
//public void next()
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(MyDate date) {
        this.year = date.year;
        this.month = date.month;
        this.day = date.day;
    }

    public MyDate(int year, int month, int day) {
        check(year,month,day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d",year,month,day);
    }

    //日期向后走
    public void next(){
        day++;
        if(day <= getDayOfMonth(year,month)){
            return;
        }

        month++;
        day = 1;
        if(month <= 12){
            return;
        }

        year++;
        month = 1;
    }

    //日期向前走一天
    public void previous(){
        day--;
        if(day >= 1){
            return;
        }

        month--;
        if(month >= 1){
            day = getDayOfMonth(year,month);
            return;
        }

        year--;
        month = 12;
        day = getDayOfMonth(year,month);
    }

    private static void check(int year, int month, int day) {
        if(month < 1 || month > 12){
            throw new RuntimeException("month 的有效范围为[1,12]");
        }
        int days = getDayOfMonth(year,month);
        if(day < 1 || day > days){
            throw new RuntimeException("day 的有效范围为[1,"+days+"]");
        }
    }

    private static int getDayOfMonth(int year, int month) {
        final int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(month == 2 && isLeapYear(year)){
            return 29;
        }
        return arr[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
