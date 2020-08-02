package optionalbaitaptimsonguyento;

public class LazyPrimeFactorization extends Thread {
    @Override
    public void run() {

       for (int i=0;i<1000;i++){
           if (isPrimeNumber(i)){
               System.out.println("LazyPrimeFactorization find prime number is :" +i);
           }
       }
    }
    public static boolean isPrimeNumber(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i < n ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
