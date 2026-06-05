public class MaximumOnes {
   public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1},
            {0, 0, 0},
            {0, 0, 1}
        };

        System.out.println(MaximumOnes(matrix));
        
    } 
    public static int MaximumOnes(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;

        int ans=-1;
        int Gcount=0;

        for(int i=0; i<n; i++){
            int low=0, high=m-1;
            int firstOneIndex=m;
            
            while(low<=high){
                int mid = (low+high)/2;
                
                if(nums[i][mid] == 1){
                    firstOneIndex = mid;
                    high = mid - 1;
                }else low = mid +1;
                
                int currentCount= m - firstOneIndex;

                if(currentCount > Gcount){
                    Gcount=currentCount;
                    ans = i;
                }

            }
        }
        return ans;
    }
}
