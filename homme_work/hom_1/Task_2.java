package homme_work.hom_1;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[] { 0, 2, 3, 2, 2, 4, 57, 6, 6, 6, 1, 100, 1 };

        countingSort(array);
        System.out.println("  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void countingSort(int[] array) {
        int k = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > k) {
                k = array[i];
            }
        }

        int[] tempArray = new int[k + 1];

        for (int value : array) {
            tempArray[value]++;
        }
        int b = 0;
        for (int i = 0; i < k + 1; ++i) {
            for (int j = 0; j < tempArray[i]; ++j) {
                array[b++] = i;
            }
        }
    }
}
