package com.jaya;

public class valid_mountain_array {
    public static void main(String[] args) {
        int[] arr={0,3,2,1};
        boolean ans=mountain_array(arr);
        System.out.println(ans);
    }
    static boolean mountain_array(int[] A){
        int N = A.length;
        int i = 0;
        while (i+1 < N && A[i] < A[i+1])
            i++;
        if (i == 0 || i == N-1)
            return false;
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
