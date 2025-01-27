package gr.aueb.cf.ch5;

import java.util.Scanner;

public class SquareApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Please give a number: ");
        num = scanner.nextInt();

        System.out.println("The square of number: " + num + " is " + square(num));
    }

    public static int square(int num) {
        return num * num;
    }
}
