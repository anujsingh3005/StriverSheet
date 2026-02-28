public class AllocateMinNoOfPages {
    public static void main(String[] args) {
        int [] nums = {25, 46, 28, 49, 24};
        int m = 4;
        int ans = Allocatefn(nums, m);
        System.out.println(ans);
    }
    public static int Allocatefn(int[] nums, int m){
        if (m > nums.length) return -1;

        int low = 0;
        int high=0;
        for(int items: nums) {
            high+=items;
            if(items > low) low = items;
        }
        int sol = -1;

        while(low<=high){
            int mid = (low+high) /2;
            boolean ans = check(nums, m, mid);
            if(ans){
                high=mid-1;
                sol=mid;
            }
            else low=mid+1;
        }
        return sol;
    }
    public static boolean check(int[] nums, int m, int mid){
        int stdCount = 1;
        int currentSum = nums[0];
        for(int i=1; i<nums.length; i++){
           if(currentSum + nums[i] > mid) {
                stdCount++;
                currentSum = nums[i]; // The new student starts their count with this book
            } else {
                currentSum += nums[i]; // Give the book to the current student
            }
        }
        return stdCount <= m;
    }
}
