class Solution {
    public int compress(char[] chars) {
       String res="";
       int c=0;
       char curr=chars[0];
       for(int i=0;i<chars.length;i++){
        if(curr==chars[i]){
            c++;
        }
        else{
            res=res+curr;
            if(c!=1){
                res+=c;
            }
            curr=chars[i];
            c=1;
        }
       }
       res=res+curr;
       if(c!=1) res+=c;
       for(int i=0; i<res.length(); i++){
        chars[i]=res.charAt(i);
}
       return res.length();
    }
}