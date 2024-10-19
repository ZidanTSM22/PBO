public class Volunteer extends StaffMember {
    // Constructor
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    // Volunteers do not get paid
    public double pay() {
        return 0.0;
    }
}
