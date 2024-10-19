public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // 1 gallon covers 350 square feet

        // Instantiate the shapes
        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        // Compute the amount of paint needed
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Print the amount of paint needed for each shape
        System.out.printf("Amount of paint needed for the deck: %.2f gallons%n", deckAmt);
        System.out.printf("Amount of paint needed for the big ball: %.2f gallons%n", ballAmt);
        System.out.printf("Amount of paint needed for the tank: %.2f gallons%n", tankAmt);
    }
}
