public class TowerOfHonai {

    public static void Toh(int n, String src, String help, String dest) {

        if( n == 1) {
            System.out.println("Move disk " + n + " from " + src +" to " + dest );
            return;
        }
        Toh(n-1, src, dest, help);
        System.out.println("Move disk " + n + " from " + src +" to " + dest );
        Toh(n-1, help, src, dest);
        
    }
    public static void main(String[] args) {
        Toh(2,"s","h","d");
    }   
}
