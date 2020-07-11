public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(5);
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(10,200);
        System.out.println(cylinder);
    }
}
