public class palindrome_number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int res = 0;
        while(temp!=0){
            int mod = temp%10;
            res = res * 10 +mod;
            temp/=10;
        }
        return  x==res;
    }
}
