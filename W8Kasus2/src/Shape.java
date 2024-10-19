public abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String name) {
        shapeName = name;
    }

    // Abstract method to compute area
    public abstract double area();

    // toString method to return the shape's name
    public String toString() {
        return shapeName;
    }
}
