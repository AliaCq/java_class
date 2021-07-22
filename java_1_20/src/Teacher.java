public class Teacher {
    public String name;
    public int age;
    public String[] courseArray;
    //定义一个构造器
    //构造方法重载  方法名一样 形参列表不同
    //1
    public Teacher(){
//        name = null;
//        age = 0;
//        courseArray = null;
        //以上代码很多重复  能不能使用调用后面的方法
        //可以
        //用this this在这里看做方法名
        //使用这种方法 这句话必须放在构造方法的第一句
        this(null,0,null);
    }

    //2
    public Teacher(String name){
//        this.name = name;
//        this.age = 0;
//        this.courseArray = null;
        this(name,0,null);
    }

    //3
    public Teacher(String name,int age){
//        this.name = name;
//        this.age = age;
//        this.courseArray = null;
        this(name,age,null);
    }

    //4
//    public Teacher(String a,int b,String[] c){
//        name = a;
//        age = b;
//        courseArray = c;;
//    }
        //上面是形参与属性不相等的情况下
        //那么形参与属性名相同该如何？？
    public Teacher(String name,int age,String[] courseArray){
//        name = name;
//        age = age;
//        courseArray = courseArray;

        this.name = name;
        this.age = age;
        this.courseArray = courseArray;
        //左边 属性（大名）通过this引用找到对象中的属性
        //右边  形参
    }
}
