public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxcount = 0;
        for (int num : nums){
            if (num == 1){
                count ++;
                maxcount = java.lang.Math.max(count, maxcount);
            }
            else
                count = 0;
        }
        return maxcount;
    }
}
