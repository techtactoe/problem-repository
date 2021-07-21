/*
Problem: Write a program to demonstrate upper bound and exact bound of an algorithm
Big O -> Max time or upper bound of time taken by an algorithm
Theta -> Exact bound of time taken by an algorithm
Omega -> Lower bound of time taken by an algorithm
 */
public class Problem01 {
    boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
