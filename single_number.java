public class single_number {
    public static void main(String[] args) {
        int result = 0;
        int[] nums={4,1,2,1,2};

        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        System.out.println(result);
    }
}
