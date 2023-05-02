import java.util.ArrayList;
import java.util.Collections;

public class container_with_most_water {
    
    // Brute force approach
    public static int container(ArrayList<Integer> heights) {
        
        int maxwater = Integer.MIN_VALUE;
        for(int i=0; i<heights.size(); i++) {
            for(int j=i+1; j<heights.size(); j++) {
                int height = Math.min(heights.get(i), heights.get(j));
                int width = j-i;
                int area = height*width;
                if(area > maxwater) {
                    maxwater = area;
                }
            }
        }
        
        return maxwater;
    }

    // Two pointer approach 
    public static int water(ArrayList<Integer> heights) {
        int maxwater = 0;
        int lp = 0;
        int rp = heights.size()-1;

        while(lp<rp) {
            // water area
            int height = Math.min(heights.get(lp), heights.get(rp));
            int width = rp-lp;
            int currentWater = height*width;
            maxwater = Math.max(maxwater, currentWater);
            //update lp rp
            if(heights.get(lp)<heights.get(rp)) {
                lp++;
            }else {
                rp--;
            }
        }
        return maxwater;
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(water(arr));

    }
}