import java.util.Arrays;
public class Median_of_two_sorted_arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sum = m + n;
        int[] arr = new int[sum];
        int count = 0;
        for (int i = 0; i < m;i++)
        {
            arr[count] = nums1[i];
            count++;
        }
        for (int i =0; i < n;i++)
        {
            arr[count] = nums2[i];
            count++;
        }
        Arrays.sort(arr);
        if (sum%2==0)
        {
            double ans;
            ans = (double)((arr[sum/2-1]+arr[sum/2])/2.0);
            return ans;
        }
        else
        {
            return (double)(arr[sum/2]);
        }
    }
}
