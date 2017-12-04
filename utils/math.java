package utils;
public class math {
    public static int factorial(int z) {
        if (z == 0) {
            return 1;
        }
         return z * factorial(z-1);
    }
        ////////    with for loop   ///
    public static int factorialLoop(int a) {
        int one=1;
        for (int b = 0; b < a; b=b+1) {
            return one= (a * factorialLoop(a - 1));
        }
           return one;
    }
}