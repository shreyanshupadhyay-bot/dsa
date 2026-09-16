class Solution {
    public int maxPower(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            
            if(st.isEmpty()){
                st.push(s.charAt(i));
                c++;
            }
            else if(st.peek()==s.charAt(i)){
                c++;
                ans=Math.max(ans,c);
                continue;
            }
            else{
                ans=Math.max(ans,c);
                c=0;
                st.push(s.charAt(i));
                c++;
            }
        }
        ans=Math.max(ans,c);
        return ans;
    }
}