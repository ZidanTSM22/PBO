public class Staff {
    private StaffMember[] staffList;

    // Constructor to initialize the staff array
    public Staff() {
        staffList = new StaffMember[8];  // Increase size to 8 for new Commission employees

        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        // Add commissioned employees
        staffList[6] = new Commission("Peter", "123 West Road", "555-1234", "321-54-6789", 6.25, 0.2); // 20% commission
        staffList[7] = new Commission("John", "987 East Ave.", "555-5678", "654-32-1098", 9.75, 0.15); // 15% commission

        // Set hours worked and sales
        ((Hourly) staffList[3]).addHours(40);  // Diane
        ((Commission) staffList[6]).addHours(35);  // Peter
        ((Commission) staffList[6]).addSales(400); // $400 sales for Peter
        ((Commission) staffList[7]).addHours(40);  // John
        ((Commission) staffList[7]).addSales(950); // $950 sales for John
    }

    // Process payment for each staff member
    public void payday() {
        for (StaffMember member : staffList) {
            System.out.println(member);
            double amount = member.pay(); // Polymorphic call
            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            System.out.println("-----------------------------------");
        }
    }
}
