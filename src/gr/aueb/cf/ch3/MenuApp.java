package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Δώστε την επιλογη σας απο 1-5:");

            choice = scanner.nextInt();

            if (choice >= 6 || choice <= 0) {
                System.out.println("Λάθος Επιλογή. Προσπαθήστε ξανά");
            }

            if (choice == 1) {
                System.out.println("1. Εισαγωγή....\n");
            }
            if (choice == 2) {
                System.out.println("2. Διαγραφή....\n");
            }
            if (choice == 3) {
                System.out.println("3. Ενημέρωση....\n");
            }
            if (choice == 4) {
                System.out.println("4. Αναζήτηση....\n");
            }
            if (choice == 5) {
                System.out.println("5. Έξοδος....\n");
            }
        } while (choice !=5);
    }
}
