public class Cylinder extends Circle {
    protected double height;
    public Cylinder(){
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return  this.height*super.getArea();
    }

    @Override
    public String toString() {
        return  "A Cylinder with radius "
                + this.getRadius()
                +" height is: "
                + this.getHeight()
                + " with volume is: "
                + this.getVolume();
    }
}
