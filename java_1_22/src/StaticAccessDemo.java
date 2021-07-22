public class StaticAccessDemo {
    public static int staticField = 0;
    public int field = 0;

    public static void staticMethod(){ }
    public void method(){}

    //在静态方法中使用
    public static void staticContext(){
        staticMethod();//可以使用静态方法
        System.out.println(staticField);//可以使用静态属性

        //不可以使用非静态属性和方法
        //method(); //编译错误
        //System.out.println(field);  //编译错误
        //原因是没有一个指向对象的引用
        //可以手动构造
        StaticAccessDemo a = new StaticAccessDemo();
        System.out.println(a.field);
        a.method();
    }


    public void normalContext(){

        staticMethod();//可以使用静态方法
        System.out.println(staticField);//可以使用静态属性

        //也可以使用非静态属性和方法
        method();
        System.out.println(field);
    }
}
