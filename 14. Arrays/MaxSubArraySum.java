public class MaxSubArraySum {
    public static void maxSubArrSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubArrSum(arr);
    }
}
