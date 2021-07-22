
public class 使用Teacher类实例化对象 {
    public static void main(String[] args) {
        Teacher a = new Teacher();
        Teacher b = new Teacher();

        //操作对象的属性的语法（读取和修改）
        System.out.println(a.age);
        System.out.println(a.name);

        a.name = "hello";
        a.age = 18;
        System.out.println(a.age);
        System.out.println(a.name);

        System.out.println(b.age);
        System.out.println(b.name);
    }
}
