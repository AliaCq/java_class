package person;

public class Teacher extends Person {
    public String course;
    public String name = "teacher";

    public Teacher(){
        super("chen");
    }

    public Teacher(String course){
        super("chen");

    }

    public void print1(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void print2(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
