package com.jaya;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums={23,1,5,6,19,28};
        int target=1;
        int ans=(linearsearch1(nums,target));
        System.out.println(ans);
    }
    static int linearsearch1(int[] num, int tar){
        for(int i=1;i< 5;i++){
            if(tar==num[i]){
                return i;
            }
        }
        return -1;
    }
}
