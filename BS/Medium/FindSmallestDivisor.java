

public class FindSmallestDivisor {
   
    public static int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 0;
        int mid = -1;

       for(int item : nums){
            max = Math.max(item, max);
       }

       while(min <= max){
            mid = (min + max)/2;

            boolean ans = check(nums, threshold, mid);
            if(ans) {
                max = mid-1;
            }
            else min= mid+1;
       } 
       return min;
    }
    public static boolean check(int[] nums, int threshold, int mid){
        int count = 0;
        for(int items: nums){
            count += Math.ceil((double) items / mid);
        }
        if(count <= threshold) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int k = 6;
        int result = smallestDivisor(nums, k);
        System.out.println(result);
    }
 
}
