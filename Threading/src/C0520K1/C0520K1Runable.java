package C0520K1;

public class C0520K1Runable implements Runnable {

    @Override
    public void run() {
        for (int i =100 ; i< 200; i++){
            System.out.println("Runable" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
