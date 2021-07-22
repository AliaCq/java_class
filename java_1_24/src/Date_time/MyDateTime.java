package Date_time;

public class MyDateTime {
    private MyDate date;
    private MyTime time;

    public MyDateTime(MyDateTime dateTime) {
        //this.date = dateTime.date; //有bug
        //this.time = dateTime.time; //有bug
        this.date = new MyDate(dateTime.date);
        this.time = new MyTime(dateTime.time);
    }

    public MyDateTime(int year,int month,int day,int hour,int minute,int second) {
        this.date = new MyDate(year,month,day);
        this.time = new MyTime(hour,minute,second);
    }
    //部分构造 只传年月日 时分秒默认0时0分0秒

    public MyDateTime(int year,int month,int day) {
       this(year,month,day,0,0,0);
    }

    public MyDateTime(MyDate date) {
        //this.date = date; //有bug
        this.date = new MyDate(date);
        this.time = new MyTime(0,0,0);
    }
    //向后走一秒
    public void next(){
        if(time.next()){
            date.next();
        }
    }
    //向前走一秒
    public void previous(){
        if(time.previous()){
            date.previous();
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s",date,time);
    }
}