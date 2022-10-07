public class distribute_candies {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int a= Integer.MIN_VALUE ;
        int type = 0;
        for(int candy:candyType){
            if(candy != a){
                type++;
                a = candy;
            }
            if(type==candyType.length/2) return type;
        }
        return type;
    }
}
