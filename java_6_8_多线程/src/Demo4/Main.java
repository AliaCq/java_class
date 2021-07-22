package Demo4;

class FirstThread extends Thread{
    final Foo1 foo;
    final Runnable runnable;

    FirstThread(Foo1 foo,Runnable runnable){
        this.foo = foo;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try{
            foo.first(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SecondThread extends Thread{
    final Foo1 foo;
    final Runnable runnable;

    SecondThread(Foo1 foo,Runnable runnable){
        this.foo = foo;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try{
            foo.second(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThirdThread extends Thread{
    final Foo1 foo;
    final Runnable runnable;

    ThirdThread(Foo1 foo,Runnable runnable){
        this.foo = foo;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try{
            foo.third(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable first = ()->{
            System.out.println("First");
        };

        Runnable second = ()->{
            System.out.println("Second");
        };

        Runnable third = ()->{
            System.out.println("Third");
        };

        Foo1 foo = new Foo1();

        FirstThread ft = new FirstThread(foo,first);
        SecondThread st = new SecondThread(foo,second);
        ThirdThread tt = new ThirdThread(foo,third);

        st.start();
        ft.start();
        tt.start();
    }
}