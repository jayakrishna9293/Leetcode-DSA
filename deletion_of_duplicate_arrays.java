package com.jaya;

public class deletion_of_duplicate_arrays {
    public static void main(String[] args) {
        int []nums={0,0,1,1,1,2,2,3,3,4};
        int ans=count_duplicates(nums);
        System.out.println(ans);
    }
    static int count_duplicates(int nums[]){
        int n = nums.length;
        if(n<=1){return n;}

        int left = 0;
        int right = 1;

        while(right<=n-1){
            if(nums[right] == nums[left]){
                right++;
            }
            else{
                nums[left+1] = nums[right];
                left++;
                right++;
            }
        }

        return left+1;
    }
}
