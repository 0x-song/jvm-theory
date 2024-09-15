package classload_1;

import java.util.concurrent.TimeUnit;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-20 22:18
 * @Version 1.0
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                A.test();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                B.test();
            }
        }).start();
    }
}
class A{
    static {
        System.out.println("class classload.A init");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        new B();
    }

    public static void test(){
        System.out.println("a test");
    }

}

class B{

    static {
        System.out.println("class classload.B init");

        new A();
    }

    public static void test(){
        System.out.println("b test");
    }
}
