public class MovesZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 20, 0, -20, 0, 20};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        // int k=0;
        // int counter = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] == 0) k++;
        //     else{
        //         nums[counter] = nums[i];
        //     counter++;
        //     }
        // }
        // int j = nums.length - 1;
        // while(k > 0){
        //     nums[j] = 0;
        //     k--;
        //     j--;
        // }

        int j =-1;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) return;
        
        for(int i=j+1; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            }
        }

        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
