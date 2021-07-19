/*
Problem: Write a function of Order of n
 */
public class Problem01 {
    public static void main(String[] args) {
        int[] arr = {12,23,44,55,10};
        System.out.println("Sum = " + sumOfArray(arr, 5));
    }

    public static int sumOfArray(int[] array, int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += array[i];
        }
        return sum;
    }
}
