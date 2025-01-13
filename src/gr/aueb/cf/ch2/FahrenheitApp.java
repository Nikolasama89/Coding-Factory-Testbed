package gr.aueb.cf.ch2;

/**
 * Simple program to convert
 * Fahrenheit to Celsius.(integers 0nly)
 */

import java.util.Scanner;

public class FahrenheitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius;
        int fahrenheit;

        System.out.println("Please provide temperature in Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("The temperature in Celsius is : " + celsius + " degrees.");
    }
}
