class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int i=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                i=m;
                break;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return i;
    }
}