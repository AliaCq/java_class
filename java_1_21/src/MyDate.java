public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int year, int month, int day) {
        if(year < 1900 || year > 3000){
            RuntimeException exception = new RuntimeException("year 参数错误");
            throw exception;
        }
        if(month <= 0 || month >12){
            throw new RuntimeException("month 参数错误");
        }
        if(day < 1 || day > getMonthDay(year,month)){
            throw new RuntimeException("month 参数错误");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(MyDate from) {
        this.year = from.year;
        this.month = from.month;
        this.day = from.day;
    }

    public int getMonthDay(int year, int month) {
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:return 31;
            case 4:
            case 6:
            case 9:
            case 11:return 30;
            case 2:return isLeapYear(year)?29:28;
            default:return -1;
        }
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 400 != 0);
    }

    @Override
    public String toString() {
        String s = String.format("%04d-%02d-%02d",year,month,day);
        return s;
    }
    public int 计算相差天数(MyDate from){
        if(this.compareTo(from) <= 0){
            throw new RuntimeException("from的日期必须在当前日期之前");
        }
        MyDate fromcopy = new MyDate(from);
        int count = 0;
        while(this.compareTo(fromcopy) > 0){
            fromcopy.increase();
            count++;
        }
        return count;
    }

    public void increase(){
        day++;
        if(day <= getMonthDay(year,month)){
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

    public int compareTo(MyDate from){
        if(year != from.year){
            if(year > from.year){
                return 1;
            }else{
                return -1;
            }
        }
        if(month != from.month){
            return month - from.month;
        }
        return day - from.day;
    }
}
