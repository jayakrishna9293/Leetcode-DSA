package com.jaya;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class repetetion_ofchar {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    }
        static void removeDuplicates(String str)
        {
            //Create LinkedHashSet of type character
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            //Add each character of the string into LinkedHashSet
            for(int i=0;i<str.length();i++)
                set.add(str.charAt(i));

            // print the string after removing duplicate characters
            for(Character ch : set)
                System.out.print(ch);
        }
    }
