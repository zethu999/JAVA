public class stockBuyAndSell {
    public static int stock(int arr[]) {
        int buyPrice = Integer.MAX_VALUE, maxprofit = 0;

        for(int i=0; i<arr.length; i++) {
            if(buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else {
                buyPrice = arr[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int profit[] = {7,1,5,3,6,4};
        System.out.println(stock(profit));

    }
}
