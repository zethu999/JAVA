import java.util.*;

public class pairSum1 {
    // Brute force 
    public static boolean pairSum(ArrayList<Integer> arr, int target) {
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    // Two pointer approach
    public static boolean pairSum1(ArrayList<Integer> arr, int target) {
        int lp = 0;
        int rp = arr.size()-1;
        while(lp!=rp) {
            if(arr.get(lp) + arr.get(rp) == target) {
                return true;
            }
            if(arr.get(lp) + arr.get(rp) < target) {
                lp++;
            }else {
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(11);
        list.add(13);
        System.out.println(pairSum1(list, 7));
    }
}
