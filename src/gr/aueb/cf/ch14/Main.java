package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.logMessage("Application Started");

        int[] arr = {1, 4, 2, 7, 39, 13, 10};

        System.out.println("The maximum number in the array is: " + MathHelper.maxNumber(arr));
        System.out.println("The minimum number in the array is: " + MathHelper.minNumber(arr));
        System.out.printf("The average number in the array is: %.2f", MathHelper.avgOfArray(arr));

    }

}
