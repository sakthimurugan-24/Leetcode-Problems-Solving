class Solution {
    void print(int l, int r, char[] s){
        if(l>=r) return;

        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;

        print(l+1,r-1,s);
    }
    public void reverseString(char[] s) {
    int l=0,r=s.length-1;
            print(l,r,s);
    }
}