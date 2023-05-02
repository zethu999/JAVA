import java.util.*;
public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> arr, int target) {
        int bp = -1;
        int n = arr.size();
        // find break point
        for(int i=0; i<n; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                bp = i;
                break;
            }
        }
        
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp) {
            if(arr.get(lp) + arr.get(rp) == target) {
                return true;
            }
            if(arr.get(lp) + arr.get(rp) < target) {
                lp = (lp+1)%n;
            }else {
                rp = (rp+n-1)%n;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(9);
        
        System.out.println(pairSum(list, 14));
    }
}
