import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Inverse Pyramid");
        int s = sc.nextInt();
        for(int i=0; i<s; i++) {
            for(int j=s; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

// * * * * * * * *
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
