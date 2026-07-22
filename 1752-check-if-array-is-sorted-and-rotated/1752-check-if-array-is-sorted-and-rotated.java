class Solution {
    public boolean check(int[] nums) {
        int ex=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[(i+1)%n]<nums[i]){
                ex++;
            }
        }
        return ex<2;
    }
}