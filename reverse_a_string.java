package com.jaya;
public class reverse_a_string {
    public static void main(String[] arg) {
        String stringinput = "Independent";
        char[] resultarray = stringinput.toCharArray();
        for (int i = resultarray.length - 1; i >= 0; i--)
            System.out.print(resultarray[i]);
    }
}
