import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort?");
        int num = scan.nextInt();

        Integer[] numbers = new Integer[num];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < num; i++) {
            numbers[i] = scan.nextInt();  // Autoboxing from int to Integer
        }

        Sorting.selectionSort(numbers);  // Sort the numbers using selection sort

        System.out.println("Sorted numbers:");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
