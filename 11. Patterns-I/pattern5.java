import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 180 Pyramid");
        int s = sc.nextInt();
        for(int i=1; i<=s; i++) {
            for(int j=1; j<=s-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


//           *
//         * *
//       * * *
//     * * * *
//   * * * * *
// * * * * * *