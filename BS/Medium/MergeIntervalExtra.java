import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalExtra {
    public static int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals,(a,b)->a[0]-b[0]); //Integer compare operation in a[0]-b[0]
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int []> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for(int[] nextInterval : intervals){
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];

            if( currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }else{
                currentInterval = nextInterval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};

        int [][] ans = merge(nums);

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<1; j++){
                System.out.print("[" + ans[i][j] +","+ ans[i][j+1] + "], ");
            }
        }
    }
}
