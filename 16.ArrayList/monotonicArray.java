import java.util.*;

public class monotonicArray {
    public static boolean mono(ArrayList<Integer> arr) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<arr.size()-1; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                inc = false;
            }
            if(arr.get(i) < arr.get(i+1)) {
                dec = false;
            }
        }
        return inc || dec;
    }    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(9);
        System.err.println(mono(list));
    }
}
