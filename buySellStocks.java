public class buySellStocks {
    public static void main(String[] args) {
        int[] nums = {10, 7, 5, 8, 11, 9};
        int n = nums.length;
        int k = stockBuySell(nums, n);
        System.out.println(k);
    }
    public static int stockBuySell(int[] nums, int n) {
        int maxsub = 0;
        int sub=0;
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                sub = nums[j] - nums[i];
            if(sub < 0){
                break;
            } 
            maxsub = Math.max(maxsub, sub);
            }
        }
       return maxsub;
    }
}
