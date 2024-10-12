import java.util.Scanner;

public class Optimus_Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        int j = 1;
        int lowerNumber = 0;
        int upperNumber = 0;

        while (i <= number) {

            if (isPrime(number - i)) {
                lowerNumber = number - i;
                break;
            }
            i++;
        }

        while (j <= number) {
            if (isPrime(number + j)) {
                upperNumber = number + j;
                break;
            }
            j++;
        }

        if (closestPrime(number, lowerNumber, upperNumber) == 0) {
            System.out.println("The closest prime numbers to " + number + " are " + lowerNumber + " and " + upperNumber);
        }
        else {
            System.out.println("The closest prime number to " + number + " is " + closestPrime(number, lowerNumber, upperNumber));
        }


    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int closestPrime(int num, int lowerPrime, int upperPrime) {

        int lowerDiff = num - lowerPrime;
        int upperDiff = upperPrime - num;

        if (lowerDiff < upperDiff) {
            return lowerPrime;
        }
        else if (lowerDiff == upperDiff) {
            return 0;
        }
        else {
            return upperPrime;
        }
    }
}
