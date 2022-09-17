package com.jaya;

public class ceiling {
    public static void main(String[] args) {
        int [] arr={45,36,30,25,20,16,15,11,8,4,3,2,0};
        int target=5;
        int ans=ceiling_tar(arr,target);
        System.out.println(ans);

    }
    static int ceiling_tar(int [] arr,int tar){
        int start=0, end=arr.length-1;
int temp=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(tar<arr[mid]){
                start=mid+1;
            }
            else if (tar>arr[mid]){
                end=mid-1;
            }
            else
                return mid;
            temp=start;
        }
            return temp;
    }
}
