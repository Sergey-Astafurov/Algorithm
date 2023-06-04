package seminars.seminar_2;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Task_1 {

    public static void main(String[] args) {
        int[] ints = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100)).limit(20).toArray();
        quickSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void quickSort(int[] arr) {
        // 3 5 1 7 5 2 8 1
        // 1. выбираем опорный элемент ( первый, рандомный (рандом квик сорт),
        // серединный)
        // 2. От способа выбора элемента зависит модификация алгоритма
        // Все элементы которые МЕНЬШЕ опорного элемента помещаются слева от него ,
        // которые БОЛЬШЕ или РАВНЫ, справа от него

        // 3 5 1 7 5 2 8 1

        quickSortRecursive(arr, 0, arr.length - 1);
    }

    // [77, 96, 52, 10, 78, 82, 47, 76, 15, 14, [36], 73, 6, 75, 7, 14, 74, 51, 91,
    // 36]
    public static void quickSortRecursive(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int baseIndex = (left + right) / 2;
        int base = arr[baseIndex];
        int i = left;
        int j = right;
        while (i <= j) {
            while (arr[i] < base) {
                i++;
            }
            while (arr[j] > base) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSortRecursive(arr, left, j);
        quickSortRecursive(arr, i, right);
    }

}
