// package Arrays;
public class profitableTrade {
    public static int stock(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }else{
                int profit = arr[i]-buyPrice;
                sellPrice = Math.max(profit, sellPrice);
            }
        }
        return sellPrice;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(stock(arr));
    }
}
