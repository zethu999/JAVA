import java.util.*;
public class NameArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names :");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i=0; i<n; i++) {
            names[i] = sc.next();
        }
        for(int i=0; i<n; i++) {
            System.out.println(names[i]);
        }
    }
}
