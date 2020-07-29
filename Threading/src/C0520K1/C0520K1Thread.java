package C0520K1;

public class C0520K1Thread extends Thread {
    @Override
    public void run() {
        for (int i =0; i < 100;i++){
            System.out.println(this.getName() + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
