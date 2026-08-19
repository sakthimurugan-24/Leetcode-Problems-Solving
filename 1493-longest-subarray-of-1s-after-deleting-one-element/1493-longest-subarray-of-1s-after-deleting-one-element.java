class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int mx=0, zc=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zc++;
            }
            while(zc>=2){
                if(nums[l]==0)
                zc--;

                l++;
                
            }
            mx=Math.max(mx,i-l);
        }
        return mx;
    }
}