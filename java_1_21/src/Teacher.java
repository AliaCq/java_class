public class Teacher {
    //1
//    public String name = "陈沛鑫";
//    public int age = 18;
    //2
//    public String name;
//    public int age;
//    {
//        name = "张三";
//        age = 22;
//    }
    //3
//    public String name;
//    public int age;
//    public Teacher(){
//        name = "李四";
//        age = 33;
//    }

//    {
//        System.out.println("我是构造代码块初始化");
//    }
//    public String name = init();
//    public String init(){
//        System.out.println("我是定义时初始化");
//        return "";
//    }
//
//    public  Teacher(){
//        System.out.println("我是构造方法，永远最后执行");
//    }

    public String name = "陈佩欣";
    public int age = 22;

    public String toString(){
        return "Teacher{name = " + name + "}" + "\n" +
                "Teacher{age = " + age + "}" ;
    }
}
