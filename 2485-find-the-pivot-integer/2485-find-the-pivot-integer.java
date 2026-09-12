class Solution {
    public int pivotInteger(int n) {
        int r=(n*(n+1))/2;
        int s=0;
        for(int i=n;i>=0;i--){
            s=s+i;
            if(r==s){
                return i;
            }
            r=r-i;
        }
        return -1;
    }
}