package com.jaya;

public class check_if {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        boolean ans = twostar(arr);
        System.out.println(ans);
    }

    static boolean twostar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j])
                    return true;
                else
                    return false;
            }
        }
          return false;
    }
}

