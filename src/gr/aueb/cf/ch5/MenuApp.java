package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        int choice = 0;
        int starsNumber = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            printMenu();
            choice = scanner.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid Action. Try Again!");
                continue;
            }

            if (choice != 6 ) {
                System.out.println("Please give number of stars: ");
                starsNumber = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    printHorizontal(starsNumber);
                    break;
                case 2:
                    printVertical(starsNumber);
                    break;
                case 3:
                    printNLinesNStars(starsNumber);
                    break;
                case 4:
                    printAscStars(starsNumber);
                    break;
                case 5:
                    printDescStars(starsNumber);
                    break;
                case 6:
                    System.out.println("Terminating the program...");
                    break;
                default:
                    System.out.println("Invalid Action");
                    break;
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Choose one of the following: ");
        System.out.println("1. Print n stars Horizontally: ");
        System.out.println("2. Print n stars Vertically: ");
        System.out.println("3. Print n lines with n stars: ");
        System.out.println("4. Print n lines with stars from 1 to n: ");
        System.out.println("5. Print n lines with stars from n to 1: ");
        System.out.println("6. Exit");
    }

    public static void printHorizontal(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printVertical(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printNLinesNStars(int num) {
        for (int i = 1; i <= num ; i++) {
            printHorizontal(num);
        }

    }

    public static void printAscStars(int num) {
        for (int i = 1; i <= num; i++) {
            printHorizontal(i);
        }
    }

    public static void printDescStars(int num) {
        for (int i = num; i >= 1 ; i--) {
            printHorizontal(i);
        }
        System.out.println();
    }
}
