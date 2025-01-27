package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PrimeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number to check if is Prime:");
        number = scanner.nextInt();

        System.out.println("Is number " + number + " Prime? " + isPrime(number) );
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
