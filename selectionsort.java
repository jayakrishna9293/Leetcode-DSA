package com.jaya;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int nums[]){
        for(int i=0;i< nums.length;i++){
            for(int j=1;j< nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}