public class PainterProblem {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        int k = 2;
        int ans = splitfn(arr,k);
        System.out.println(ans);
    }
    public static int splitfn(int [] arr, int k){
        int n = arr.length;
        if(n < k) return -1;

        int low=0,high=0;

        for(int i=0; i<n; i++){
            high +=arr[i];
            if(arr[i] > low) low = arr[i];
        }
        int ans=0;

        while(low<=high){
            int mid = (low + high)/2;

            ans = check(arr, k, mid);
            
            if(ans > k) low = mid+1;
            else high = mid - 1;
        }
        return low;
    }
    public static int check(int[] nums, int k, int mid){
        int currentSum = 0;
        int count=1;

        for(int i=0; i<nums.length; i++){
            if(currentSum + nums[i] > mid){
                count++;
                currentSum=nums[i];
            }else currentSum +=nums[i];
        }
        return count;
    }

}
