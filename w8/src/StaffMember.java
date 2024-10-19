abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    // Constructor
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    // Return a string including basic employee information
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }

    // Derived classes must define the pay method
    public abstract double pay();
}
