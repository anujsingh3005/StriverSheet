public class buySellStocks {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int n = nums.length;
        int k = stockBuySell(nums, n);
        System.out.println(k);
    }
    public static int stockBuySell(int[] nums, int n) {
        int maxpro = 0;
        int min=Integer.MAX_VALUE;

        for(int items : nums){
            if(items < min) min = items;
            else maxpro = Math.max(maxpro, items - min);
        }
        
       return maxpro;
    }
}
