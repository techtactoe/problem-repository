/*
Problem: Write a program in which the order can not be determined.
Since the order is non deterministic, we break the execution time of the algorithm into 3 cases
-> Best Case (If the size of the array is even)
-> Average Case (We have to assume the average inputs to the function. For our usecase we are assuming that both even
and odd sized arrays are equally likely, that might not be the case always)
-> Worst Case (If the size of the array is always odd, in which case the loop gets executed)
 */
public class Problem02 {
    public static int sumOfArray(int[] array, int size){
        if(size % 2 == 0) //If size if even, then it becomes a constant order of growth
            return 0;
        int sum = 0;
        for(int i = 0; i < size; i++){ //If size is odd, then it becomes an order of n growth
            sum += array[i];
        }
        return sum;
    }
}
