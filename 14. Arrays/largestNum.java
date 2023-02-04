public class largestNum {
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {74,79,43,218,496,8,18641,6448964} ;
        System.out.println(largest(arr));
    }
}
