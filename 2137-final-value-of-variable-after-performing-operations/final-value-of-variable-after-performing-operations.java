class Solution {
    public int finalValueAfterOperations(String[] oper) {
        int n = oper.length;
        int ans =0;
        for(String st:oper){
            char ch = st.charAt(0);
            char c = st.charAt(2);
    if(ch=='-'){
        ans--;
    }
    else if(c=='-'){
        ans--;
    }
    else{
        ans++;
    }
        }
        return ans;
    }
}