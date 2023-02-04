public class palindrome {
    public static boolean pal(int n) {
        
        int reverse = 0, num = n;;
        
        while(n>0) {
            int reminder = n % 10;
            reverse = (reverse * 10) + reminder;
            n = n/10;
        }
        if(reverse == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(pal(121));
    }
}
