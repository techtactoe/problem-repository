/*
Problem: Looping over n times while doing some constant work
 */
public class Problem01 {
    public static void main(String[] args) {
        //The order of growth would be ceiling[10/5] i.e. Theta(n)
        for (int i = 0; i < 10; i += 5) {
            //Some Theta(1) work, i.e. constant work
        }

        //The order of growth would be ceiling[10/5] i.e. Theta(n)
        for (int i = 10; i > 0; i -= 5) {
            //Some Theta(1) work, i.e. constant work
        }

        //The order of growth would be ceiling(log 20 base 2) i.e. Theta(log n)
        for (int i = 1; i < 20; i *= 2) {
            //Some Theta(1) work
        }

        //The order of growth would be floor(log 20 base 2) i.e. Theta(log n)
        for (int i = 20; i > 0; i /= 2) {
            //Some Theta(1) work
        }

        //The order of growth would be (log log n) i.e. Theta(log log n)
        for(long i = 2; i < 400; i = (long)Math.pow(i,2)){
            //Some Theta(1) work
        }
    }
}
