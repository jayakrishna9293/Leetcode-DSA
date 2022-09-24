import java.util.Arrays;

public class sort_by_parity {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int ans[] = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }
        static int[] sortArrayByParity(int[] nums) {
            if(nums == null || nums.length == 0)
                return nums;

            int cur = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] %2== 0){
                    int tmp = nums[cur];
                    nums[cur] = nums[i];
                    nums[i] = tmp;
                    cur++;
                }
            }
            return nums;
        }

}
