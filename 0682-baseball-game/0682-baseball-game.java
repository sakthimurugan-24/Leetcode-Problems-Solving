class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ops=operations[i];
            if(ops.equals("C")){
                st.pop();
            }
            else if(ops.equals("D")){
                int v=st.peek()*2;
                st.push(v);
            }
            else if(ops.equals("+")){
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.pop();
                st.push(b);
                st.push(a);
                st.push(b+a);
            }
            else{
                int num=Integer.parseInt(ops);
                st.push(num);
            }
        }
        int s=0;
        while(!st.isEmpty()){
            s=s+st.peek();
            st.pop();
        }
        return s;
    }
}