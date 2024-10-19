public class Paint {
    private double coverage;

    // Constructor
    public Paint(double c) {
        coverage = c;
    }

    // Method to compute amount of paint needed
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
