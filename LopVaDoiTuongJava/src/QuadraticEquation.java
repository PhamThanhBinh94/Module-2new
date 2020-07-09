import java.util.Scanner;

public class QuadraticEquation {
    private static Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;


    public static void main(String[] args) {
        System.out.println("a là: ");
        double a = scanner.nextDouble();
        System.out.println("b là: ");
        double b = scanner.nextDouble();
        System.out.println("c là: ");
        double c = scanner.nextDouble();
        QuadraticEquation result = new QuadraticEquation(a,b,c);
        double delta = result.getDiscrimination();
        if (delta < 0) {
            System.out.println("The equation has no real roots");
        } else if (delta == 0) {
            System.out.println("The equation has one root" + result.getRoot());
        } else
            System.out.println("The equation has two roots: " + "x1= " + result.getRoot1() + "x2= " + result.getRoot2());
    }
    public QuadraticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getRoot(){
        return (-this.b)/(2*this.a);
    }
    public double getRoot1(){
        return ((-this.b +Math.sqrt(this.getDiscrimination()))/(2*this.a));
    }
    public double getRoot2(){
        return ((-this.b -Math.sqrt(this.getDiscrimination()))/(2*this.a));
    }

    public double getDiscrimination() {
        double delta = b * b - 4 * a * c;
        return delta;
    }
}
