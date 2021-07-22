package Demo1;
//synchronized使用
public class SyncDemo1 {
    public synchronized void method(){
    }

    //等同于
    public void method1(){
        synchronized (this){
        }
    }

    public static synchronized void staticMethod(){
    }
    //等同于
    public static void staticMethod1(){
        synchronized (SyncDemo1.class){
        }
    }

    public void someMethod(){
        //同步代码块 用在方法内部
        Object o = new Object();
        synchronized (o){
            //o这个引用不能为null
        }
    }

}
