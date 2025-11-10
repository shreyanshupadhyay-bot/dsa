class Solution {
    public String largestOddNumber(String str) {
       int l = str.length()-1;
       
       for(int i = l;i>=0;i--){
        int digit = str.charAt(i)-'0';
        if(digit%2==1){
            return str.substring(0,i+1);
        }
       }
       return"";
    }
}