package Assignment1;

/**
 * Prime checking and helpers.
 */
public class prime {

    /** Returns true if n is a prime number (2, 3, 5, 7, ...). */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 87;
        if (prime.isPrime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }

        int small = 5;
        System.out.println("factorial(" + small + ") = " + prime.factorial(small));
    }
}
