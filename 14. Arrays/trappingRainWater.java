import java.util.*;
public class trappingRainWater {
    public static int waterTrapped(int bars[]) {
        int n = bars.length;
        int trappedWater = 0;
        if(n == 1 || n == 2) {
            return trappedWater;
        }

        // leftmax Aux array
        int leftmax[] = new int[n];
        leftmax[0] = bars[0];
        for(int i=1; i<n; i++) {
            leftmax[i] = Math.max(bars[i], leftmax[i-1]);
        }
        // rightmax Aux array
        int rightmax[] = new int[n];
        rightmax[n-1] = bars[n-1];
        for(int i=n-2; i>=0; i--) {
            rightmax[i] = Math.max(bars[i], rightmax[i+1]);
        }
        // water level
        for(int i=0; i<n; i++) {
            int waterLevel = (Math.min(leftmax[i], rightmax[i])) - bars[i] ;
            trappedWater = trappedWater + (waterLevel < 0 ? 0 : waterLevel);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int bars[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(waterTrapped(bars)); 
    }
}