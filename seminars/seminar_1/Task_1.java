


public class Task_1 {
    public static void main(String[] args) { }

    private static int findMax(int[] array){

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private static int sumEven(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i=i+2) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int[] findSum(int[] arr, int target){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+ arr[j] == target){
                    return new int[] {i,j};

                }
            }
        }
        return new int[]{-1,-1};
    }
}