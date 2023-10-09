package Homework02;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    public static int[] prepareArray() {
        return prepareArray(random.nextInt(5, 50));
    }

    private static int[] prepareArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-99, 100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int e : array) {
            System.out.printf("%d\t", e);
        }
        System.out.println();
    }
}
