package gr.aueb.cf.ch14;

import java.util.Arrays;

public class MathHelper {

    private MathHelper() {

    }

    public static int maxNumber(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minNumber(int[] arr) {
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double avgOfArray(int[] arr) {
        int sum = 0;
        double avg = 0;

        for (int num : arr) {
            sum +=num;
        }

        avg = (double) sum / arr.length;

        return avg;
    }
}
