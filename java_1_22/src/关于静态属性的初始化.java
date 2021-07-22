public class 关于静态属性的初始化 {
    //按照书写顺序执行
    //两种初始化方法  1.定义时初始化  2. 代码块
    public static int a = init();

    static {
        System.out.println("我是代码块初始化");
    }
    public static int init(){
        System.out.println("我是定义时初始化");
        return 1;
    }

    public static void main(String[] args) {

    }
}
