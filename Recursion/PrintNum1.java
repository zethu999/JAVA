import java.util.*;

public class PrintNum1 {

    public static void PrintNum(int n) {
        if(n==0) {
            return;
        }
        // System.out.println(n); //To print in descending order 10 9 8 7 6 5 4 3 2 1;
        PrintNum(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNum(n);
    }
}
