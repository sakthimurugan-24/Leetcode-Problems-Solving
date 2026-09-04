class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] sufarr=new int[n];
        sufarr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufarr[i]=Math.min(sufarr[i+1],nums[i]);
        }
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            int ins=mx-sufarr[i];
            if(ins<=k) return i;
        }
        return -1;
    }
}