class Solution {
    public int maxProduct(int n) {
      
        int c=0;
        int t=n;
        while(t!=0){
            c++;
            t=t/10;
        }
        int []arr=new int[c];
        t=n;
        int k=0;
        while(t!=0){
            int e=t%10;
            arr[k]=e;
            k++;
            t=t/10;
        }
        int m=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int p=arr[i]*arr[j];
                m=Math.max(m,p);
            }
        }

          return m;
    }
}