import java.util.*;

public class pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the box dimmnesion");
        int length = sc.nextInt();
        int width = sc.nextInt();
        for(int i=0; i<length; i++) {
            for(int j=0; j<width; j++) {
                if(i == 0 || i == (length-1) || j == 0 || j == (width-1)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}

// 5
// 8
// * * * * * * * *
// *             *
// *             *
// *             *
// * * * * * * * *