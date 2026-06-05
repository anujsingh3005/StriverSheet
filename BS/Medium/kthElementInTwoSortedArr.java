public class kthElementInTwoSortedArr {
    public static int kthElement(int[] nums1, int[] nums2, int k) {
        if(nums1.length > nums2.length) return kthElement(nums2,nums1, k);

        int m = nums1.length;
        int n = nums2.length;

        int low = Math.max(0, k-n);
        int high = Math.min(m, k);
        int halfLen = k;

        while(low<=high){
            int i = (low + high) / 2;
            int j = halfLen - i;

            int left1 = (i == 0) ? Integer.MIN_VALUE : nums1[i-1];
            int right1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int left2 = (j == 0) ? Integer.MIN_VALUE : nums2[j-1];
            int right2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if(left1 <= right2 && left2 <= right1){
                return Math.max(left1,left2);  
            }else if (left1 > right2) high = i - 1;
            else low = i + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
    int [] a = {100, 112, 256, 349, 770};
    int [] b = {72, 86, 113, 119, 265, 445, 892};
    int k = 7 ;
        int ans = kthElement(a, b, k);
        System.out.println(ans);
    }
}
