class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int mx=0;
        while(l<r){
           int mnn=Math.min(height[l],height[r]);
            int d=r-l;
            int w=mnn*d;
             mx=Math.max(mx,w);
             if(height[l]<height[r]) l++;
             else r--;
        }
        return mx;
    }
}