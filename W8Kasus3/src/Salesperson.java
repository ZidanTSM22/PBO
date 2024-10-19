public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // Implement compareTo based on total sales and name
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;  // Compare by sales
        } else {
            return other.lastName.compareTo(this.lastName);  // Reverse alphabetical order by last name
        }
    }

    // toString method
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}
