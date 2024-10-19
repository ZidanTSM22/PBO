public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
        totalSales = 0;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0;  // Reset sales after pay
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
