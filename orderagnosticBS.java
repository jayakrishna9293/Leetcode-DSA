package com.jaya;

public class orderagnosticBS {
    public static void main(String[] args) {
        //int [] arr={45,36,30,25,20,16,15,11,8,4,3,2,0};
        int [] arr={0,2,3,5,9,11,12,16,23,36,45,56};
        int target=2;
        int ans=binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int [] arr,int tar){
        int start=0, end=arr.length-1;
        boolean isasc =arr[start]>arr[end];

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(isasc) {
                if (tar < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else{
                if (tar > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

        }
        return -1;
    }

}
