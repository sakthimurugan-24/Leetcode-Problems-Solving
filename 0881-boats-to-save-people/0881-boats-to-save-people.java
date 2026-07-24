class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int b=0;
        int r=people.length-1;
        while(l<=r){
            if((people[l]+people[r])<=limit){
                b++;
                l++;
                r--;

            }
            else{
                if(people[r]<=limit){
                    b++;
                    r--;
                }
            }
        }
        return b;
    }
}