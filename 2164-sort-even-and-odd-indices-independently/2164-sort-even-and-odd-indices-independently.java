class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int os=0,es=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                es++;
            }
            else{
                os++;
            }
        }
        int[] odd=new int[os];
        int[] even=new int[es];
        int l=0,r=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[l]=nums[i];
                l++;
            }
            else{
                odd[r]=nums[i];
                r++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        l=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even[l];
                l++;
            }
            else{
                nums[i]=odd[r-1];
                r--;
            }
        }
        return nums;
    }
}