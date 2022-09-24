public class first_and_last_element {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    int search(int []nums,int target, boolean findstartindex){
        int start=0, end=nums.length-1,ans=-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;

            }
            else if((target>nums[mid])){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
