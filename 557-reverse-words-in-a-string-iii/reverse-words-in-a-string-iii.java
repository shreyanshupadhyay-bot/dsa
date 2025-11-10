class Solution {
    public String reverseWords(String str) {
        int l = str.length();
         String s = new String("");
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<l;i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                
                sb.append(ch);
            }
            else{
                sb.reverse();
                s+=sb;
                sb = new StringBuilder("");
                s+=' ';
            }
        }
        sb.reverse();
        s+=sb;
        return s;
    }
}