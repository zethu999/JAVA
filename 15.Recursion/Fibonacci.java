import java.util.*;


public class Fibonacci {

    public static void Fib(int first, int second, int n) {
        if(n==0) {
            return;
        }

        System.out.println(first);
        Fib(second, first+second, n-1);
    }


    public static void main(String[] args) {
        Fib(1,1,10);
    }    
}
