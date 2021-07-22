package v1;

public class TeacherTest {
    public static void main(String[] args) {
        //构造对象 得到a引用，用于操作对象
        Teacher a = new Teacher();
        //通过a引用，为对象的属性进行赋值
        a.name = "陈沛鑫";
        a.age = 35;
        a.courseArray = new String[] {"javase","数据结构"};
        //通过a引用，调用属于该对象的方法
        a.自我介绍();

        Teacher b = new Teacher();
        //
        b.name = "张三";
        b.age = 33;
        b.courseArray = new String[] {"c","c++","linux"};

        b.自我介绍();
    }
}
