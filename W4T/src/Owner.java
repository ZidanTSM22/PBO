// Class that shows Aggregation relationship
class Owner {
    private Dog dog; // Owner has a Dog (Aggregation)

    public Owner(Dog dog) {
        this.dog = dog;
    }

    public void playWithDog() {
        System.out.println("Owner is playing with dog.");
        dog.sound();  // Calling the method of the Dog (Dependency)
    }
}
