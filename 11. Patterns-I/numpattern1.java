import java.util.*;
public class numpattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for number pattern :");
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}

// 1
// 22
// 333
// 4444
// 55555

// 1
// 12
// 123
// 1234
// 12345