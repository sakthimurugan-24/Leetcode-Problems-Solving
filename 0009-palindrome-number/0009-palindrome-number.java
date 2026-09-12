class Solution {
    public boolean isPalindrome(int x) {
        long n=x;
        long s=0;
        if(n<0) return false;
        while(n>0){
            s=(s*10)+(n%10);
            n=n/10;
        }
        if(s==x) return true;
        else
        return false;
    }
}