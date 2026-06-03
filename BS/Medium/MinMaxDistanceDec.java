public class MinMaxDistanceDec {
        public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 9;
        double ans = distfn(arr,k);
        System.out.println(ans);
    }
    public static double distfn(int [] nums, int k){
        double low=0.0, high = 0.0;
        for(int i=0; i<nums.length-1; i++){
            high = Math.max(high ,nums[i+1] - nums[i]);
        }

        double diff = 1e-6; //10^-1

        while(high - low > diff){
            double mid = (high + low) / 2.0;

            boolean ans = check(nums, mid, k);

            if(ans) high=mid;
            else low=mid;
        }
        return high;
    }
    public static boolean check(int[] nums, double mid, int k){
        int stationsNeeded = 0;

        for(int i=0; i<nums.length-1; i++){
            double gap = nums[i+1] - nums[i];
            stationsNeeded += (int)(gap/mid);
        }
        return stationsNeeded <= k;
    }
}
