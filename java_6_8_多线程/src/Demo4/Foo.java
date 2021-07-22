package Demo4;
//加锁模式
//还是一种轮询模式
public class Foo {
    private int step = 1;
    public Foo(){}

    public void first(Runnable runnable) throws InterruptedException{
        while (true){
            synchronized (this){
                if (step == 1){
                    break;
                }
            }
        }
        runnable.run();
        synchronized (this) {
            step = 2;
        }
    }

    public void second(Runnable runnable) throws InterruptedException{
        while (true){
            synchronized (this){
                if (step == 2){
                    break;
                }
            }
        }
        runnable.run();
        synchronized (this) {
            step = 3;
        }
    }

    public void third(Runnable runnable) throws InterruptedException{
        while (true){
            synchronized (this){
                if (step == 3){
                    break;
                }
            }
        }
        runnable.run();
        synchronized (this) {
            step = 1;
        }
    }
}
