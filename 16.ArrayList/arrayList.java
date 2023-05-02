import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void operations() {
        // creating arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr1  = new ArrayList<>();
        ArrayList<Boolean> arr2 = new ArrayList<>();
        
        // Basic operations on arraylist
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.set(1,000);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        arr.remove(2);
        System.out.println(arr.get(1));
        arr.contains(000);
        System.out.println(arr.size());
        Collections.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }

    public static void main(String[] args) {
        // operations();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr.size());
        arr.add(1,120);
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println(arr.contains(0));
        Collections.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}