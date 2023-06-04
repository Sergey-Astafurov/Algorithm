package lects.lect_2;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 2, 1, 5, 10, 6, 8, 9 };
        directSort(arr);

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println(BinarySearch(arr, 1, 0, arr.length-1));
    }

    public static void bubleSort(int[] arr) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);

    }

    public static void directSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            if (i != minPos) {
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
    }
    public static int BinarySearch(int[] arr, int value, int min, int max) {
        int midpoint ;
        if (max < min){
            return -1;
        }else{
        midpoint= (max - min ) / 2 + min ;
        }
        if (arr[midpoint] < value){
            return BinarySearch(arr, value, midpoint+1, max);
        }else {
            if(arr[midpoint]> value){
                return BinarySearch(arr, value, min, midpoint-1);
            }else{
                return midpoint;
            }
        }
    }


}
