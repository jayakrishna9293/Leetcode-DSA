public class missing_number {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[a]!=i){
                return i;
            }
            a++;
        }
        return nums.length;
    }
}
