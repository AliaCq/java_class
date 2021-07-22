package Demo4;

//懒汉模式
//线程不安全的 下面以修改为线程安全
public class SingletonClass2 {
    private SingletonClass2(){

    }

    private static volatile SingletonClass2 singletonClass = null;

    //有人调用getingletonClass2方法时，意味着有人要用到这个对象了
    //有人用到这个对象时，再实例化对象

    //这样性能实在不高
    private synchronized SingletonClass2 getSingletonClass(){
        //判断是否实例化过
        if(singletonClass==null){
            singletonClass = new SingletonClass2();
        }
        return singletonClass;
    }

    //为了提升性能并且使得懒汉模式线程安全
    private SingletonClass2 getSingletonClass1(){
        //判断是否实例化过
        if(singletonClass==null){
            //只有在singletonClass == null时才需要保护
            synchronized (SingletonClass2.class) {
                if (singletonClass == null) {    //二次判断机制
                    singletonClass = new SingletonClass2();
                }
            }
        }
        return singletonClass;
    }
}
