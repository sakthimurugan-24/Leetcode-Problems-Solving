class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int j=0;
         int s=0;
       int c =0;
      double mx=Double.NEGATIVE_INFINITY;
      double av=0;
      for(int i=0;i<nums.length;i++){
           s=s+nums[i];
        
          c++;
          if(c>k){
         
              s=s-nums[j];
              j++;
             c--;
          }
          if(c==k){
             av=(double)s/k;
          mx=Math.max(mx,av);
          }
      }
      return mx;
    }
}