public class linearSearch {
    public static int liSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,4,5,2,3,6,7,9};
        System.out.println(liSearch(arr, 3));
    }
}
