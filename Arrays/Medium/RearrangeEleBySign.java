public class RearrangeEleBySign {
    public static void main(String[] args) {
        int [] nums = {2, 4, 5, -1, -3, -4};
        nums = rearrangeArray(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<nums.length;i++){
            if(nums[i] >= 0){
                ans[posIndex] = nums[i];
                posIndex +=2;
            }
            else{
                ans[negIndex] = nums[i];
                negIndex +=2;
            }
        }

        return ans;
    }
}
