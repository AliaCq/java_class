public class AddDemo {
    public static void main(String[] args) {
        //int a = 5;
        //int b = 3;
        //System.out.println(a+b);
//
//        byte a = 10;  //1个字节
//        short b = 20; //2个字节
//        int c = 30;   //4个字节
//        d = 40;  //8个字节
        //sout
//
//        double e = 10;
//        double f = 10.0; //10.0默认是double类型
//
//        char g = '中';

//        boolean h = true;
//        boolean i = false;
//        System.out.println(h);
//        System.out.println(i);

//        String s = "我是中国人";
//        String s2 = "我是中国人";
//        System.out.println(s);
//        s = s + 10;//s + 字符串拼接  将数字10转换成"10"拼接在s后面 (也就是使用了第30行的代码)
//        System.out.println(s);
//        s2 = 10 +s2 ;// 字符串拼接  将数字10转换成"10"拼接在s2前面 (也就是使用了第30行的代码)
//        System.out.println(s);
//        String s1 = String.valueOf(10);//等效于 String s1 = "10";
//        System.out.println(s1);
//
//        String i = "10";
//        int n = Integer.valueOf(i);
//        System.out.println(n);
//        System.out.println(n+1);
//        System.out.println(n+2);

//        String m = "hello";
//        int p = Integer.valueOf(m);
//        System.out.println(p);//这三行会报错  传的参数“hello”有问题
        //观察byte能保存的最小值和最大值
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//
//        //观察short能保存的最小值和最大值
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//
//        //观察int能保存的最小值和最大值
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        //观察long能保存的最小值和最大值
//        System.out.println(Long.MIN_VALUE);
    }
}
//ctrl+/ 批量注释和取消

//java变量和数据类型
//变量定义
//可接受的数据类型 变量名;
//int a;    如果没有初始值 会报错 编译错误
//int a = 5;定义加初始化

//变量使用
//a = 3;  赋值
//System.out.println(a+3);

//数据类型
//1.基本数据类型
//8种
//数值
//整型  byte/short/int/long
//浮点型 float/double
//字符 char
//布尔类型  boolean
//2.引用数据类型
// String 字符串

//字面量
//int a = 10;
//10 + 3;
//上面的10就是字面量 默认是int类型
//10L/10l 就转换成long型
//类型转换（type cast）(发生在变量赋值的时候) a的类型与？的类型不同时
//long a = 10;小范围赋给大范围是自然而然的 不会报错
//int a = (int)10l; 转换
//字面量的默认进制
//默认十进制打印
//int a = 0x10;
//int b = 010;
//int c = 0b101;
//System.out.println(a); 打印10
//System.out.println(b);  打印8
//System.out.println(c);   打印5
//可以这样  int a = 1_000_000;

//字符类型 char
//char 类型默认保存Unicode编码  2个字节

//表达式类型 -类型提升
// int + long =>long
// int + double =>double
// long + double =>double

//final修饰的变量(只能赋值一次)
//final int i = 10;
//或者
//final int a;
//a = 10;

//变量作用域
//同c语言  作用域在括号内部

//1.语法错误/编译错误
//2.运行时错误
//   运行时异常  结果不符合预期