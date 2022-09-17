package com.jaya;
public class armstrong {
    public static void main(String[] args) {
        int num=1634,rem=0,res=0,temp;
        temp=num;
        while (temp!=0){
            rem=temp%10;
           res+=Math.pow(rem,3);
            temp=temp/10;
        }
        if(res==num){
            System.out.println("is a Armstrong number");
        }
        else {
            System.out.println("not a Armstrong number");
        }
    }
}
