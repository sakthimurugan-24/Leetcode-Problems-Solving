    class Solution {
        public int thirdMax(int[] nums) {
        int n=nums.length;
            long mx=Long.MIN_VALUE;
            long mx2=Long.MIN_VALUE;
            long mx3=Long.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>mx){
                mx3=mx2;
                mx2=mx;
                mx=nums[i];
            }
            else if(nums[i] > mx2   && nums[i]!=mx){
                mx3 = mx2;
                mx2 = nums[i];
    }
            else if(nums[i]>mx3 && nums[i]!=mx2 && nums[i]!=mx){
                mx3=nums[i];
            }

        }
        if(mx3==Long.MIN_VALUE)
        return (int)mx;
        return (int )mx3;
            // for(int i=0;i<n;i++){
            //     if(nums[i]>mx){
            //         mx=nums[i];
            //     }
            // }
            // for(int i=0;i<n;i++){
            //     if(mx!=nums[i]){
            //         if(nums[i]>mx2){
            //             mx2=nums[i];
            //         }
            //     }
            // }
            // for(int i=0;i<n;i++){
            //     if(mx!=nums[i] && mx2!=nums[i]){
            //         if(nums[i]>mx3){
            //             mx3=nums[i];
            //         }
            //     }
            // }
            // if(n==0) return 0;
            // else if(n==1 || n==2) return mx;
            // // else if(n==2) return mx2;
            // else
            // return mx3;
        }
    }