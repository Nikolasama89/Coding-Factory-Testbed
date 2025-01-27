package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a temperature in celsius: ");
        celsius = scanner.nextDouble();
        System.out.println("Temperature in celsius: " + celsius + " , Fahrenheit: " + celsiusToFahrenheit(celsius));
    }

    public static double celsiusToFahrenheit (double celsius) {
        double fahrenheit;

        fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }

}
