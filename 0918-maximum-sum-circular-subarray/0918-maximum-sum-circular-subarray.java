class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cmax=0,cmin=0,mx=Integer.MIN_VALUE,mn=Integer.MAX_VALUE,ts=0;
        for(int i=0;i<nums.length;i++){
            cmin=cmin+nums[i];
            mn=Math.min(mn,cmin);
            if(cmin>0) cmin=0;

            cmax=cmax+nums[i];
            mx=Math.max(mx,cmax);
            if(cmax<0) cmax=0;

            ts=ts+nums[i];
        }
        if(mx<0) return mx;

        int ans=Math.max(mx,ts-mn);
        return ans;
    }
}