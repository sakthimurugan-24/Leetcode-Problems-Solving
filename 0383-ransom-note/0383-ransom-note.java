class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp1=new HashMap<>();
    

        for(int i=0;i<ransomNote.length();i++){
            mp1.put(ransomNote.charAt(i),mp1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
         for(int i=0;i<magazine.length();i++){
            mp1.put(magazine.charAt(i),mp1.getOrDefault(magazine.charAt(i),0)-1);
            
        }
        for (char key : mp1.keySet()) {
            if (mp1.get(key) > 0) {
                return false;
            }
        }
         return true;
    }
}