package person;

public class EnglishTeacher extends Teacher{
    public String getName(){
        return "english" + super.getName();
    }

    public void teach(){
        super.teach();
        System.out.println("我是英语老师");
    }

    public void speak(){
        System.out.println("听说读写");
    }
}
