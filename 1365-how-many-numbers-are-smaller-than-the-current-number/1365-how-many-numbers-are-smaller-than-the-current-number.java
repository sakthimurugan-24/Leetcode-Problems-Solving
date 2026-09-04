class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int j=0,c;
        int[] res=new int[nums.length];
        while(j!=nums.length){
            c=0;
            for(int i=0;i<nums.length;i++){
                if(nums[j]>nums[i]){
                    c++;
                }
            }
            res[j]=c;
            j++;
        }
        return res;
    }
}