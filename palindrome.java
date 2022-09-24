package com.jaya;

public class palindrome {
        public static void main(String[] args) {
            String input= "madam";
            if(isPalindrome(input))
            {
                System.out.println(input+" is a palindrome string");
            }
            else
            {
                System.out.println(input+" is not a palindrome string");
            }
        }

        public static boolean isPalindrome(String str) {
            int left = 0, right = str.length() - 1;
            while(left < right)
            {
                if(str.charAt(left) != str.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
