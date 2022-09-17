package com.jaya;

public class binary_search {
    public static void main(String[] args) {
        int [] arr={45,36,30,25,20,16,15,11,8,4,3,2,0};
        int target=2;
        int ans=binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int [] arr,int target){
        int start=0, end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                start=mid+1;
            }
            else if (target>arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
