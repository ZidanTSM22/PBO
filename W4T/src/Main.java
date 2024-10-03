
// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create an instance of Dog
        Owner owner = new Owner(myDog); // Owner has a Dog (Aggregation)
        owner.playWithDog();  // Owner depends on Dog to play (Dependency)
    }
}
