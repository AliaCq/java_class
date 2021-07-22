public class TeacherTest {
    public static void main(String[] args) {
        //对象
        Teacher a = new Teacher("AAA",18);
        a.introduce();

        int b = Teacher.countOfTeacher;
        System.out.println(b);
        System.out.println(Teacher.buildTeacher("hello"));
        System.out.println(Teacher.getCountOfTeacher());
        System.out.println(Teacher.countOfTeacher);
        System.out.println(Teacher.buildTeacher("world"));
        System.out.println(Teacher.getCountOfTeacher());
        System.out.println(Teacher.countOfTeacher);
    }
}
