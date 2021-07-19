/*
Approach II
Problem: Find the sum of first n natural numbers (This is done in O(n) time)
 */
public class Problem02 {
    public static void main(String[] args) {
        System.out.println("The sum of first 5 natural numbers = " + fun2(5));
    }

    public static int fun2(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
