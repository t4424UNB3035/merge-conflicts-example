public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

        int checkPrimeNumber = 17; // Change this to the number you want to check for primality
        boolean isPrime = isPrimeNumber(checkPrimeNumber);
        System.out.println(checkPrimeNumber + " is prime: " + isPrime);
    }

}
