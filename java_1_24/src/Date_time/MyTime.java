package Date_time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(MyTime time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    public MyTime(int hour, int minute, int second) {
        check(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    //返回值代表本次向后走一秒 是否走到第二天
    //true 有进位
    public boolean next(){
        second++;
        if(second < 60){
            return false;
        }

        minute++;
        second = 0;
        if(minute < 60){
            return false;
        }

        hour++;
        minute = 0;
        if(hour <24){
            return false;
        }

        hour = 0;
        return true;
    }

    //返回值代表本次向前走一秒 是否走到前一天
    //true 有进位
    public boolean previous(){
        second--;
        if(second >= 0){
            return false;
        }

        minute--;
        second = 59;
        if(minute >= 0){
            return false;
        }

        hour--;
        minute = 59;
        if(hour >= 0){
            return false;
        }

        hour = 23;
        return true;
    }

    private void check(int hour, int minute, int second) {
        if(hour < 0 || hour > 23){
            throw new RuntimeException("hour 的有效范围为[0,23]");
        }

        if(minute < 0 || minute > 59){
            throw new RuntimeException("minute 的有效范围为[0,59]");
        }

        if(second < 0 || second > 59){
            throw new RuntimeException("second 的有效范围为[0,59]");
        }
    }
}
