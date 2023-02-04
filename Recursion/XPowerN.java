import java.util.*;

public class XPowerN {

    public static int Pow(int num, int power) {
        if(num == 0) {
            return 0;
        }
        if(power == 0) {
            return 1;
        }

        int xpower = num * Pow(num, power-1);
        return xpower;
        
    }

    public static void main(String[] args) {
        int a = Pow(2,10);
        System.out.println(a);
    }
}
