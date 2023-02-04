public class prefixSum {
    public static void pfSum(int ar[]) {
        int maxSum = 0;
        int psum[] = new int[ar.length];
        psum[0] = ar[0];
        for(int i=1; i<ar.length; i++) {
            psum[i] = psum[i-1] + ar[i];
        }

        for(int i=0; i<ar.length; i++) {
            for(int j=i; j<ar.length; j++) {
                int currsum = i==0 ? psum[j] : psum[j] - psum[i-1];
                if(currsum > maxSum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        pfSum(arr);
    }
}
