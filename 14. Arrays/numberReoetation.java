import java.util.*;
public class numberReoetation {
    public static boolean repeat(int arr[]) {
        // using hashset
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,3,5,6,87,9,98,9};
        System.out.println(repeat(arr));
    }
}
