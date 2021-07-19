/*
Approach I
Problem: Find the sum of first n natural numbers (This is done in O(1) time)
 */
public class Problem01 {
    public static void main(String[] args) {
        System.out.println("The sum of first 5 natural numbers = " + fun1(5));
    }

    public static int fun1(int n){
        return n * (n + 1) / 2;
    }
}
