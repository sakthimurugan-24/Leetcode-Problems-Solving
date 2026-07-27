class Solution {
    public int maxProduct(int[] nums) {
        int k=Integer.MIN_VALUE,mx=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                mx=(nums[i]-1)*(nums[j]-1);
                k=Math.max(mx,k);
            }
        }
        return k;
    }
}