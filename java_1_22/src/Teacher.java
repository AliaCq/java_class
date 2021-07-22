public class Teacher {
    //类用于实例化对象的模板--不被static修饰
    //一直和对象有关
    public String name;
    public int age;

    //构造方法用于构造某个老师
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //某个老师自我介绍
    public void introduce(){
        System.out.printf("我是%s,我今年%d岁\n",name,age);
    }

    //类用于静态属性和静态方法的集合 -- 都被static修饰
    //与对象无关
    public static int countOfTeacher = 0;
    public static String buildTeacher(String name){
        countOfTeacher++;
        return name;
    }
    public static int getCountOfTeacher(){
        return countOfTeacher;
    }
}
