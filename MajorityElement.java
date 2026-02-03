public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 1, 2};
        int k = majorityElement(nums);
        System.out.println(k);
    }
    public static int majorityElement(int[] nums) {
        int count = 1;
        int element = 0;

        for(int i=0; i<nums.length;i++){
            if(count==0){
                count = 1;
                element = nums[i];
            }else if(element == nums[i]) count++;
            else{
                count--;
            }
        }
        return nums[element];
    }
}
