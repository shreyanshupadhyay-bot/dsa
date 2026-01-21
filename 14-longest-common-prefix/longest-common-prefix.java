class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length-1;
        StringBuilder st = new StringBuilder();
        String s =strs[0];
        String b =strs[n];
        for(int i=0;i<Math.min(s.length(),b.length());i++){
            if(s.charAt(i)!=b.charAt(i)){
                return st.toString();
            }
            else{
            st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}