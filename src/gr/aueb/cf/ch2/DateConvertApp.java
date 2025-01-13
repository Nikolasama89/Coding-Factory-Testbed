package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateConvertApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int month;
        int year;
        int twoDigitsYear;

        System.out.println("Please provide the date with this format: DD/MM/YYYY");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        twoDigitsYear = year % 100;


        System.out.printf("Date is: %02d/%02d/%d\n", day, month, twoDigitsYear);
    }
}
