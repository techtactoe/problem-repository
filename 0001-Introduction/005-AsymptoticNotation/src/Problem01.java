/*
Problem: Write a program to demonstrate higher bound, lower bound and exact order of growth
 */
public class Problem01 {
    //Takes constant time when the element is present at the first index in the array - Omega(n) (Constant time)
    //If the element is not present or present at the last location in the array, then it will take O(n) time -> Big O (Linear time or less than linear time)
    //If the element is somewhere in between, then it will take average time or Theta(n) time
    int search(int[] arr, int n, int x){
        for(int i = 0; i < n; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}
