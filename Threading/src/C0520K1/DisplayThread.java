package C0520K1;

public class DisplayThread extends Thread{
    Display displayObj;
    DisplayThread(Display displayObj){
        this.displayObj = displayObj;
    }

    @Override
    public void run() {
        displayObj.display(100);
    }
}
