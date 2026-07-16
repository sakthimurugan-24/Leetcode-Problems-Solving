class Solution {
public:
    int gcdOfOddEvenSums(int n) {
        int ec=0,oc=0;
        for(int i=1;i<n+n;i++){
            if(i%2==0){
                ec=ec+i;
            }
            else{
                oc=oc+i;
            }
        }
        return gcd(ec,oc);
    }
};