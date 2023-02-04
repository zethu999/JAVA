import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        switch(b) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Hi");
            break;
            default : System.out.println("Not Valid");
        }

        if(b>2) {
            System.out.println("Iam in...");
        }else {
            System.out.println("Hey How are you ?");
        }


        
    }
}
