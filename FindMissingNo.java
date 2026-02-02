public class FindMissingNo {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 6};
        int n = missingNumber(nums);
        System.out.println(n);
    }
    public static int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i =0 ; i<nums.length; i++){
        //     if ( i != nums[i]) return i;
        //     if(i == nums.length-1) return i+1; 
        // }
        // return -1;

        int n = nums.length;
        //Gauss' Formula
        int expSum = n * (n+1) / 2;
        int actualSum = 0;

        for(int i=0; i<n; i++){
            actualSum += nums[i];
        }
        return expSum - actualSum;
    }
}
