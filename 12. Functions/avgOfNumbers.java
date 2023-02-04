// Enter 3 numbers from the user & make a function to print their average

import java.util.*;
public class avgOfNumbers {

    public static void avg(int a, int b, int c) {
        float average = (a+b+c)/3;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a,b,c);
    }
}
