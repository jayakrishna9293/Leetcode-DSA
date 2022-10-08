package math

class Shortest_to_char {
    public int[] shortestToChar(String s, char c) {
        char[] arr = s.toCharArray();
        int[] result = new int[s.length()];
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int i=0; i<s.length(); i++) {
            for (int j=i; j<s.length(); j++) {
                if (arr[j] == c && first == Integer.MAX_VALUE) {
                    first = Math.abs(j - i);
                    break;
                } 
            }
            for (int j=i; j>=0; j--) {
                if (arr[j] == c && second == Integer.MAX_VALUE) {
                    second = Math.abs(j - i);
                    break;
                } 
            }
            result[i] = Math.min(first, second);
            first = Integer.MAX_VALUE;
            second = Integer.MAX_VALUE;
        }
        
        return result;
    }
}