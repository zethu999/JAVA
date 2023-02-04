import java.util.Scanner;

public class Nfact {

    static int Nfacto (int n) {
        if(n==0 || n==1) {
            return 1;
        }

        int fact = n * Nfacto(n-1);
        return fact;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Nfacto(n));
    }
}
