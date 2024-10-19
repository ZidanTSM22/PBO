public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    // Implement area method
    public double area() {
        return length * width;
    }

    // toString method
    public String toString() {
        return super.toString() + " (length: " + length + ", width: " + width + ")";
    }
}
