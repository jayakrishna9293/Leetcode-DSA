public class even_noofdigits {
    public int findNumbers(int[] nums) {
        int count=0,even=0;
        for(int num:nums){
            while(num>0){
                count++;
                num/=10;
            }
            if(count%2==0){
                even++;
            }
            count=0;
        }
        return even;
    }
}
