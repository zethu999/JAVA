import java.util.Scanner;

public class starPyramid {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            for(int line = 1; line<=num; line++) {
                for(int star = 1; star<=line; star++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}

// *
// * *
// * * *
// * * * *
// * * * * *