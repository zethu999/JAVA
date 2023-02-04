

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of star");
        int star = sc.nextInt();
        for(int i=0; i<star; i++) {
            for(int j=0; j<star; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
