class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder result = new StringBuilder(num);
        for(int i=num.length()-1;i>=0;i--){
            char s=num.charAt(i);
            if(s=='0'){
              result.deleteCharAt(i);
            }
            else{
                break;
            }
            System.out.println(i);
        }
        return result.toString();
    }
}