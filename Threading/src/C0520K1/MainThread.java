package C0520K1;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

public class MainThread {
    public static void main(String[] args) {
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("test");
//            }
//        };
        C0520K1Thread thread3 = new C0520K1Thread();
        C0520K1Runable runable = new C0520K1Runable();
        Thread thread4 = new Thread(runable);

//        thread1.start();
//        thread2.start();
        thread3.start();
        thread4.start();

//        thread2.run();
//        thread2.run();
    }
}
