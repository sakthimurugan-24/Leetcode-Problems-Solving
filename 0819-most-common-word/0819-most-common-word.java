class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer>mp=new HashMap<>();
        String [] words=paragraph.toLowerCase().split("[ !?',;.]+");
        for(int i=0;i<words.length;i++){
            mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }

           for(String word : banned){
                 mp.remove(word);
            }
            String mx="";
            int mn=Integer.MIN_VALUE;
            for(Map.Entry<String , Integer>entry : mp.entrySet()){
               if(entry.getValue()>mn){
                mn=entry.getValue();
                mx=entry.getKey();
               }
            }
            return mx;
        
    }
}