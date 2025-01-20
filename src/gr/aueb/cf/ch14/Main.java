package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        String word = "maDAM  ";
        String str = "Hello this is Coding factory class!";
        int number = 10;

        logger.logMessage("Application Started");

        int[] arr = {1, 4, 2, 7, 39, 13, 10};

        System.out.println("The maximum number in the array is: " + MathHelper.maxNumber(arr));
        System.out.println("The minimum number in the array is: " + MathHelper.minNumber(arr));
        System.out.printf("The average number in the array is: %.2f\n", MathHelper.avgOfArray(arr));

        System.out.println(StringUtils.toUpperWord(word));
        System.out.println(StringUtils.reverse(word));
        System.out.println("String is palindrome: " + StringUtils.isPalindrome(word));

        System.out.println(ValidationUtils.isValidLength(str));
        System.out.println(ValidationUtils.isBetweenOneTen(number));
    }
}
