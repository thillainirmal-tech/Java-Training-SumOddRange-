public class SumOddRange {

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        System.out.println("Sum of odd numbers from 1 to 10: " + sumOdd(1, 10));       // Output: 25
        System.out.println("Sum of odd numbers from 5 to 15: " + sumOdd(5, 15));       // Output: 50
        System.out.println("Sum of odd numbers from 10 to 20: " + sumOdd(10, 20));     // Output: 75
        System.out.println("Sum of odd numbers from 1 to 1: " + sumOdd(1, 1));         // Output: 1
        System.out.println("Invalid range (10, 5): " + sumOdd(10, 5));                 // Output: -1
        System.out.println("Invalid range (negative): " + sumOdd(-5, 10));             // Output: -1
    }
}
