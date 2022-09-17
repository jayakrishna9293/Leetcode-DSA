package com.jaya;

import java.util.Arrays;

public class replace_elements {
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        int ans[]=remove(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] remove(int [] arr){
        if (arr == null) {
            return arr;
        }
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            arr[i] = max;
            max = Math.max(max, val);
        }
        return arr;
    }
}
