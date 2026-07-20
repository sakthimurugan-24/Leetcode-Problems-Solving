class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        while(columnNumber!=0){
            columnNumber=columnNumber-1;
            int d=columnNumber%26;
            s=(char)(d+65)+s;
            columnNumber=columnNumber/26;
        }
        return s;
    }
}