package gr.aueb.cf.ch14;

public class StringUtils {

    private StringUtils() {

    }

    public static String toUpperWord(String word) {
        return word.toUpperCase();
    }

    public static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString().trim();

    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        String lowerWord = word.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(lowerWord);
        String reversedWord = String.valueOf(sb.reverse());

        return reversedWord.equals(lowerWord);
    }
}
