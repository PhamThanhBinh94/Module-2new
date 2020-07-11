package LopPointvaMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(3.0f,4.0f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint();
        System.out.println("The point has not moved: ");
        movablePoint = new MovablePoint(5.0f,6.0f,7.0f,8.0f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println("When point move: ");
        System.out.println(movablePoint);
    }
}
