package gr.aueb.cf.ch5;

public class FindMaxApp {

    public static void main(String[] args) {
        int maxNumber = findMax(5, 10, 2);

        System.out.println("Max number is: " + maxNumber);
    }

    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
