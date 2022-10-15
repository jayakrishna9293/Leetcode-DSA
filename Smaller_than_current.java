package math

class Smaller_than_current {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=getSmallCount(nums,nums[i]);
        }
        return ans;
    }
    static int getSmallCount(int[] nums,int num){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<num){
                count++;
            }
        }
        return count;
    }
}