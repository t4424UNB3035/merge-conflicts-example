public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

        int checkPrimeNumber = 17; // Change this to the number you want to check for primality
        boolean isPrime = isPrimeNumber(checkPrimeNumber);
        System.out.println(checkPrimeNumber + " is prime: " + isPrime);
    }

    // Helper method to calculate the factorial of a number recursively
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
