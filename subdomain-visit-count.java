class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
          
        String[] dummy = new String[cpdomains.length];
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new LinkedList<>();
        System.arraycopy(cpdomains, 0, dummy, 0, cpdomains.length);
        
        for(String s: dummy){
            int index = s.indexOf(" ");
            int val = Integer.parseInt(s.substring(0, index));
            s = s.substring(index+1);
            map.put(s, map.getOrDefault(s, 0)+val);
            
            while(s.indexOf(".") != -1){
                s = s.substring(s.indexOf(".")+1);
                map.put(s, map.getOrDefault(s, 0)+val);
            }
            
        }
        
        for(String s: map.keySet()){
            ans.add(map.get(s) + " " + s);
        }
        
        return ans;
        
    }
}
