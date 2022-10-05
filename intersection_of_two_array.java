public class intersection_of_two_array {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] check = new boolean[1001];
        int[] res = new int[Math.max(nums1.length,nums2.length)];

        for(int num: nums1)
            check[num] = true;

        int count = 0;
        for(int num: nums2){
            if(check[num] == true){
                res[count] = num;
                count++;
                check[num] = false;
            }
        }

        return Arrays.copyOf(res,count);
    }
}
