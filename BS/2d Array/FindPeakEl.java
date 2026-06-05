class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low=0, high=m-1;

        while(low<=high){
            int mid = (low+high)/2;
            int[] maxE = maxElement(mat, mid);
            
            int leftVal = (mid > 0) ? mat[maxE[1]][mid - 1] : -1;
            int rightVal = (mid < m - 1) ? mat[maxE[1]][mid + 1] : -1;

            if(mat[maxE[1]][mid] > leftVal && mat[maxE[1]][mid] > rightVal) return new int[] {maxE[1],mid};
            else if (mat[maxE[1]][mid] < leftVal) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};

    }
    public static int[] maxElement(int[][] mat, int mid){
        int max = -1;
        int row = 0;
        for(int j=0; j<mat.length; j++){
            if(mat[j][mid] > max) {
                max = mat[j][mid];
                row=j;
            }
        }
        return new int[] {max,row};
    }
}