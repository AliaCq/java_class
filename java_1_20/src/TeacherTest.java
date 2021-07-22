import java.util.Arrays;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher a =new Teacher(); //1构造
        Teacher b =new Teacher("陈沛鑫");//2构造
        Teacher c =new Teacher("陈沛鑫",35);//3构造
        Teacher d =new Teacher("陈沛鑫",35,new String[] {"javase","数据结构"});//4构造

        //看一下下列代码打印什么？(此时Teacher四个方法内部啥也没有)
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(Arrays.toString(d.courseArray));
        System.out.printf("====================\n");

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(Arrays.toString(a.courseArray));
        System.out.printf("====================\n");
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(Arrays.toString(b.courseArray));
        System.out.printf("====================\n");
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(Arrays.toString(c.courseArray));
        System.out.printf("====================\n");
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(Arrays.toString(d.courseArray));
        System.out.printf("====================\n");
    }
}
