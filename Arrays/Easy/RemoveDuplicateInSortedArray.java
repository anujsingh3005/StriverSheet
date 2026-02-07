public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] nums = {-2, 2, 4, 4, 4, 4, 5, 5};
        int u = removeDuplicates(nums);
        for(int i=0; i<u; i++){
            System.out.print(" "+ nums[i] +" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}
