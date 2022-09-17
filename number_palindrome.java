package com.jaya;

public class number_palindrome {
    public static void main(String[] args) {
        int num=12121,temp=num,sum=0,rem;
        while(temp!=0){
            rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("is a palindrome number");
        }else{
            System.out.println("not a palindrome number");
        }
    }
}
