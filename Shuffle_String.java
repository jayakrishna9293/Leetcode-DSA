class Solution {
    public String restoreString(String s, int[] indices) {
         char  ch[] = s.toCharArray();
    int n = ch.length;
    char ch1[] = new char[n];
    
    for (int i = 0; i < n; i++) {
        ch1[indices[i]] = ch[i];
    }
    
    return new String(ch1);
    }
}
