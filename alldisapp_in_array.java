public class alldisapp_in_array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count = new int[nums.length];
        List<Integer> result = new ArrayList();

        for(int i = 0; i < nums.length; i++){
            count[nums[i] - 1] = 1;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                result.add(i+1);
            }
        }

        return result;
    }
}
