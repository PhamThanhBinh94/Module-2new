package btsudunglopillegaltriangleexception;

import javax.crypto.spec.PSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edge a of triangle is: ");
        int a = sc.nextInt();
        System.out.println("Edge b of triangle is: ");
        int b = sc.nextInt();
        System.out.println("Edge c of triangle is: ");
        int c = sc.nextInt();
        if (a < 0 || b < 0 || c < 0 || a + b <= c || b + c <= a || a + c <= b){
            throw new InputMismatchException();
    } else System.out.println("This triangle very perfect!!");
    }

    public static void main(String[] args) {
        IllegalTriangleException account = new IllegalTriangleException();
        try{
            account.calculate();
        } catch (InputMismatchException e){
            System.out.println("An exception has occurred");
        }
    }
}
