import java.util.Arrays;

public class height_checker {
    public static void main(String[] args) {
        int [] heights={1,1,4,2,1,3};
        int ans=heightChecker(heights);
        System.out.println(ans);
    }
    static int heightChecker(int[] heights) {
        int expected[] = Arrays.copyOfRange(heights,0,heights.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i =0; i<heights.length;i++){
            if(heights[i] != expected[i])
                count++;
        }
        return count;
    }
}
