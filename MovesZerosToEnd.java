public class MovesZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 20, 0, -20, 0, 20};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int k=0;
        int counter = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0) k++;
            else{
                nums[counter] = nums[i];
            counter++;
            }
        }
        int j = nums.length - 1;
        while(k > 0){
            nums[j] = 0;
            k--;
            j--;
        }

        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
