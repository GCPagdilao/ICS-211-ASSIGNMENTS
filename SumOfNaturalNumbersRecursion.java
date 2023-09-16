public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 1) {
            return 1; // Base case: When n is 1, return 1.
        } else {
            // Recursive case: Sum of the first (n-1) natural numbers + n
            return calculateSum(n - 1) + n;
        }
    }
}
