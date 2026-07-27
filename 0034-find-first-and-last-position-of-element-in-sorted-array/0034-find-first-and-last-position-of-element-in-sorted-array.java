class Solution {

    public int[] searchRange(int[] nums, int target) {
        int c=0;
        int[] ans={-1,-1};
        if(c==0){
         int l=0,r=nums.length-1;
        int i=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                i=m;
                ans[0]=i;
                r=m-1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
             if(m==i) c=1;
        }
       
        }
        if(c==1){
             int l=0,r=nums.length-1;
        int i=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                i=m;
                
                ans[1]=i;
                l=m+1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
       
       
        }
        System.out.println(c);
        return ans;

    }
}