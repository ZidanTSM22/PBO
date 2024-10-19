import java.util.Arrays;

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] staff = {
                new Salesperson("John", "Doe", 500),
                new Salesperson("Jane", "Smith", 600),
                new Salesperson("Jim", "Brown", 600),
                new Salesperson("Jake", "White", 700),
                new Salesperson("Julie", "Green", 500)
        };

        // Sort staff array using insertion sort in descending order of sales
        Sorting.insertionSort(staff);

        System.out.println("Salesperson in descending order of sales:");
        for (Salesperson person : staff) {
            System.out.println(person);
        }
    }
}
