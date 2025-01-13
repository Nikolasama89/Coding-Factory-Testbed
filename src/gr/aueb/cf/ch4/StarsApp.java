package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * 5 different programs where use provides number
 * we generate stars
 * 1.n horizontal
 * 2.n vertical
 * 3. n x n
 * 4. from 1 to n
 * 5. from n to 1
 */

public class StarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars;

        System.out.println("How many stars you want to print horizontally?");
        stars = scanner.nextInt();
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("How many stars you want to print vertically?");
        stars = scanner.nextInt();
        for (int i = 0; i <= stars; i++) {
            System.out.println("*");
        }

        System.out.println("Insert an integer for n X n");
        stars = scanner.nextInt();
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Insert an integer for ascending stars");
        stars = scanner.nextInt();
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Insert an integer for descending stars");
        stars = scanner.nextInt();
        for (int i = stars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
