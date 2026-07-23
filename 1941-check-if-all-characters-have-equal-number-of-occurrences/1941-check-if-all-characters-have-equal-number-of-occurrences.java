class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int f=-1;
        for(int i :hm.values()){
            if(f==-1){
                f=i;
            }
            else if(f!=i){
                return false;
            }
        }
        return true;
    }
}