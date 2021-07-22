package person;

public class Test {
    public static void main(String[] args) {
        Teacher p = creatObject();
        //System.out.println(p.getName());
        p.teach();
    }

    private static EnglishTeacher creatObject() {
        return new EnglishTeacher();
    }
}
