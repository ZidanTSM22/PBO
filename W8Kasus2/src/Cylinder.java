public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // Implement area method
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // toString method
    public String toString() {
        return super.toString() + " (radius: " + radius + ", height: " + height + ")";
    }
}
