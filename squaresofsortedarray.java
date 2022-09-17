package com.jaya;

import java.util.Arrays;

public class squaresofsortedarray {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        squares(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void squares(int [] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]*=arr[i];
        }
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
