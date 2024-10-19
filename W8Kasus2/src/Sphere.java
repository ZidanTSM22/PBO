public class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    // Implement area method
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // toString method
    public String toString() {
        return super.toString() + " (radius: " + radius + ")";
    }
}
