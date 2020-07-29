package bttaothreaddongian;

public class NumberGenetator implements Runnable {

    @Override
    public void run() {

        for (int i =0; i<10;i ++){
            System.out.println(i + " " + hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable r = new NumberGenetator();
        Runnable r1 = new NumberGenetator();
        Thread thObj = new Thread(r);
        Thread thObj1= new Thread(r1);
        thObj.start();
        thObj.setPriority(Thread.MAX_PRIORITY);
        thObj1.start();
    }
}
