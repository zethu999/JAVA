public class reverseArray {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while(first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        reverse(ar);
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
