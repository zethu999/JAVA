import java.util.*;
public class numpattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for number Pyramid");
        int num = sc.nextInt();
        for(int i=num; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=num; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

// 12345
// 1234
// 123
// 12
// 1

// 55555
// 4444
// 333
// 22
// 1