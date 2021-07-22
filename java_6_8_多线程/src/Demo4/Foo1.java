package Demo4;
//通知模式
public class Foo1 {
    private int step = 1;

    public Foo1(){}

    public void first(Runnable runnable) throws InterruptedException{
        synchronized (this){
            while (step != 1){
                this.wait();
            }
        }
        runnable.run();
        synchronized (this){
            step = 2;
            this.notifyAll();
        }
    }

    public void second(Runnable runnable) throws InterruptedException{
        synchronized (this){
            while (step != 2){
                this.wait();
            }
        }
        runnable.run();
        synchronized (this){
            step = 3;
            this.notifyAll();
        }
    }

    public void third(Runnable runnable) throws InterruptedException{
        synchronized (this){
            while (step != 3){
                this.wait();
            }
        }
        runnable.run();
        synchronized (this){
            step = 1;
            this.notifyAll();
        }
    }
}
