/*
Approach III
Problem: Find the sum of first n natural numbers (This is done in O(n^2) time)
 */
public class Problem03 {
    public static void main(String[] args) {
        System.out.println("The sum of first 5 natural numbers = " + fun3(5));
    }

    public static int fun3(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                sum++;
            }
        }
        return sum;
    }
}
