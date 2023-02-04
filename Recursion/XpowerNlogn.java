public class XpowerNlogn {
    public static int pow(int x, int n) {

        if(x == 0) {
            return 0;
        }
        if(n ==0 ) {
            return 1;
        }

        if(n % 2 == 0) {
            return pow(x , n/2) * pow(x, n/2);
        }else {
            return pow(x, n/2) * pow(x, n/2) * x;
        }
        
    }

    public static void main(String[] args) {
        int a = pow(5, 2);
        System.out.println(a);
    }
}
