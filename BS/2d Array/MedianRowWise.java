public class MedianRowWise {
    public static void main (String args[]){
        int [][] matrix = {{1,4,9},{2,5,6},{3,7,8}};
        System.out.println(medianCal(matrix));
    }

    public static int medianCal(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) low = Math.min(low, nums[i][0]);
        for(int i=0; i<n; i++) high = Math.max(high, nums[i][m-1]);

        while(low<=high){
            int mid = (low+high)/2;
            int count = blackbox(nums,mid);
            int req = (n*m)/2;

            if(count <= req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static int blackbox(int[][] nums, int number){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count += upperBound(nums,i,number);
        }
        return count;
    }
    public static int upperBound(int[][] nums, int row, int number){
        int low=0, high=nums[row].length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[row][mid]<=number) low = mid+1;
            else high=mid-1;
        }
        return low;
    }
}
