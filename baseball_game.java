package math

class Solution {
    public int calPoints(String[] ops) {
        List<Integer> ll = new ArrayList<>();
        int count=-1;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("D")){
                ll.add(2*ll.get(count));
                count++;
            }
            else if(ops[i].equals("C")){
                ll.remove(count);
                count--;
            }
            else if(ops[i].equals("+")){
                int temp=ll.get(count-1)+ll.get(count);
                ll.add(ll.get(count-1)+ll.get(count));
                count++;
            }
            else {
                ll.add(Integer.parseInt(ops[i]));
                count++;
            }
        }
        int ans =0;
        for(int i=0;i<ll.size();i++){
            ans+=ll.get(i);
        }
        return ans;
    }
}