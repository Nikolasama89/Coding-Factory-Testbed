package gr.aueb.cf.ch14;

public class ValidationUtils {

    private ValidationUtils() {

    }

    public static boolean isValidLength(String str) {
        int limitChars = 31;
        if (str == null) return false;

        return str.length() > 1 && str.length() <= limitChars;

    }

    public static boolean isBetweenOneTen(int num) {
        return num >= 1 && num <= 10;
    }
}

