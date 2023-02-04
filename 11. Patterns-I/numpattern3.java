import java.util.*;
public class numpattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for number pattern :");
        int num = sc.nextInt();
        int count = 1;
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                if((i+j) %2 == 0) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        
    }
}


// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1