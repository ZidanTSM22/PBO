public class MathUtils {

    // Returns the factorial of the argument n.
    // Throws IllegalArgumentException for invalid input (n < 0 or n > 16).
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial for numbers larger than 16 causes overflow.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
