import java.util.Scanner;
public class SumOfNatrualnumbers {

    public static int SumOFNN(int n) {
        if(n==0) {
            return 0;
        }

        int sum = n + SumOFNN(n-1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(SumOFNN(n));
    }
}
