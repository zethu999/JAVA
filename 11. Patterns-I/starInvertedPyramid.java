import java.util.Scanner;
public class starInvertedPyramid {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int line=n; line>=1; line--) {
                for(int star=line; star>=1; star--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

// * * * * *
// * * * *
// * * *
// * *
// *