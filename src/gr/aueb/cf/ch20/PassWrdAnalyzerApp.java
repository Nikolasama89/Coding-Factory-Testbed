package gr.aueb.cf.ch20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWrdAnalyzerApp {

    public static void main(String[] args) {
        String passWord;

        // if password is not correct asks until its valid
        do {
            passWord = userPasswrd();
        } while (!isValidPassword(passWord));

        System.out.println("Password Accepted!");
    }

    /**
     * Prompts user to give a password
     * @return the password
     */
    public static String userPasswrd() {
        Scanner scanner = new Scanner(System.in);
        String passwrd = "";

        System.out.println("Please give your password");
        System.out.println("Password must contain 8 characters at least, 1 upper, 1 lower," +
                " 1 digit and one special character (#?!@$%^&*-)");
        passwrd = scanner.nextLine();
        return passwrd;
    }

    /**
     * Checks if the password is valid based on the requirements
     * at least 1 upper letter, 1 lower letter, 1 digit and 1 special character
     * @param password is taken from method userPasswrd().
     * @return true if is valid else false
     */
    public static boolean isValidPassword(String password) {

        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Invalid PassWord. Try again");
            return false;
        }
    }
}
