public class Problem01 {
    //Overall complexity is Theta(n) as that is the highest growing term
    void fun(int n){
        //Theta(n)
        for(int i = 0; i < n; i++){
            //Some Theta(1) work
        }
        //Theta(log n)
        for(int i = 1; i < n; i = i * 2){
            //Some Theta(1) work
        }
        //Theta(1)
        for(int i = 1; i < 100; i++){
            //Some Theta(1) work
        }
    }

    //Overall complexity is Theta(n*Log n)
    void fun2(int n){
        for(int i = 0; i < n; i++){ //Theta(n)
            for(int j = 1; j < n; j = j * 2){ //Theta(log n)
                //Some Theta(1) work
            }
        }
    }

    //Overall complexity is Theta(n*n) as that contributes the highest time to the runtime
    void fun3(int n){
        //Overall complexity Theta(n*log n)
        for(int i = 0; i < n; i++){ //Theta(n)
            for(int j = 1; j < n; j = j*2){ //Theta(log n)
                //Some Theta(1) work
            }
        }

        //Overall complexity Theta(n*n)
        for(int i = 0; i < n; i++){ //Theta(n)
            for(int j = 1; j < n; j++){ //Theta(n)
                //Some Theta(1) work
            }
        }
    }

    //Overall Theta(n log n + (m * m))
    void fun4(int n, int m){
        //Overall Theta(n * log n)
        for(int i = 0; i < n; i++){ //Theta(n)
            for(int j = 1; j < n; j = j * 2){ //Theta(log n)
                //Some Theta(1) work
            }
        }

        //Overall Theta(m * m)
        for(int i = 0; i < m; i++){ //Theta(m)
            for(int j = 1; j < m; j++){ //Theta(m)
                //Some Theta(1) work
            }
        }
    }
}
