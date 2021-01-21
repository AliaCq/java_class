//总结
//为什么使用方法
//语法  定义和使用
//自顶向下
//类的作用

//类的第一作用---方法的组织单位
//方法（语句的组织单位）类似于c中的函数
//方法是某个对象相关联的动作集合
//方法的定义阶段和使用阶段
//1.定义阶段
//例子
//public static     void          main(String[] args) {  args 变量名   String[] 参数类型
//   方法的修饰符  方法的返回值类型   方法名称(除了首个单词 其余首字母大写) （形参parameter）多个参数之间用逗号分隔
//}
//2.使用阶段 （方法的调用和运行）
//方法名标识（要调用那个方法）+（实参）；

//方法可以定义不使用
//先写大纲 在写细节  => 自顶向下的思考 （面向过程）

//方法签名
//
//

//方法重载
//方法名一样 参数列表不一样 -属于不同方法

//同一个类下 不允许出现方法名相同的定义

//方法的调用规则
//没有定义的方法不可以使用  定义的方法可以不使用
//类名.方法名(实参列表)
//调用同一类的方法  方法名(实参列表)
//
//

//JVM中内存的区域划分
//Java(代码) ->Byte code <- JVM运行字节码的抽象机器
//JVM有责任管理内存(变量 语句等等)
//栈区  数据结构中的栈
//栈的基本单位是帧  一次存取按帧来进行
//帧(frame)是方法的一次运行
//先进后出
//同样的帧可能不止一个  调用一次方法就创立一个帧
//栈帧中主要存放局部变量 包括形参  不包括方法语句

public class 方法介绍 {

    //定义一个方法  完成两个整数相加
    public static int add(int a,int b) {
        return a + b;   //返回值类型必须和int之间有转换的关系
    }

    //定义一个方法 计算n(int) 的 m (int) m>=0 次方，结果是long类型
    public static long pow(int n,int m){
        int i = 1;
        long num = 1;
        for(i = 1;i<=m;i++){
            num = num * n;
        }
        return num;
    }

    //给定一个n 判断他是不是水仙花数
    // int n
    //返回类型为boolean
    //计算三次方使用pow方法
    public static boolean judge(int n){
        int i = n;
        long sum = 0;
        while(i != 0){
            int d = i % 10;
            i = i / 10;
            sum = sum + pow(d,3);
        }
        if(sum == n){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
//        System.out.println(add(2, 3));
//        System.out.println(judge(153));
//        System.out.println(judge(154));
        int i = 0;
        for(i = 100;i<=999;i++){
            if(judge(i))
                System.out.printf("%d 是水仙花数\n",i);
        }

    }
}
