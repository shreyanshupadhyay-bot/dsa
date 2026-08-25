class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
            gen("",0,0,n);
            return ans;
            }
    void gen(String curr,int st,int last,int n){
        if(st==n&&last==n){
            ans.add(curr);
            return;
        }
        if(st<n){
            gen(curr+"(",st+1,last,n);
        }
         if(last<st){
            gen(curr+")",st,last+1,n);
        }
    }
}