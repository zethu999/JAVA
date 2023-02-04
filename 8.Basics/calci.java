import java.util.*;;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next() ;
        
        if(c=="+") {
            System.out.println(a+b);
        }else if (c=="-") {
            System.out.println(a-b);
        }else if (c=="*") {
            System.out.println(a*b);
        }else if (c=="/") {
            System.out.println(a/b);
        }
    }
}
