package Demo4;

//饿汉模式
public class SingletonClass1 {
    private SingletonClass1(){

    }

    private static SingletonClass1 singletonClass = new SingletonClass1();

    private SingletonClass1 getSingletonClass(){
        return singletonClass;
    }
}
