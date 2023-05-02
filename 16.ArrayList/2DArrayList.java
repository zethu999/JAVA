import java.util.Collections;
import java.util.ArrayList;

public class 2DArrayList {

    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();   // 2d array
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();                   // 1d arrays

            for(int i=0; i<5; i++) {
                list1.add(i);               //  adding elements to 1d arrays
                list2.add(i+5);
            }
        
            nestedList.add(list1);
            nestedList.add(list2);          // adding 1d arrays to 2d arrays
        
            for(int i=0; i<nestedList.size(); i++) {
                ArrayList<Integer> currList = nestedList.get(i);
                for(int j=0; j<currList.size(); j++) {
                    System.out.print(currList.get(j) + " ");
                }
                System.out.println();
            }
        
    }
}

