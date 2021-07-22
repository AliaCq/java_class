package person;

public class MathTeacher extends Teacher {
    public String getName(){
        return "math" + super.getName();
    }

    public void teach(){
        super.teach();
        System.out.println("我是数学老师");
    }

    public void draw(){
        System.out.println("画图形");
    }
}
