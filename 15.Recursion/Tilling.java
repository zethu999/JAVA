public class Tilling {
    public static int tilling(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int vertical = tilling(n-1);
        int horizontal = tilling(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tilling(5));
    }
}
