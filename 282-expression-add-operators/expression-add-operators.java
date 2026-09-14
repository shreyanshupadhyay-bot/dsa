class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> an= new ArrayList<>();
    ans(0,num,target,"",an,0l,0l);
    return an;
    }
    void ans(int index,String st,int target,String curr,List<String> ans,Long prev,Long res){
        if(index==st.length()){
        if(res==target){
            ans.add(curr);
        }
        return;
        }
        
        String str = "";
        long currres=0;
        for(int i=index; i<st.length();i++){
            if(i>index && st.charAt(index)=='0'){
                break;
            }
            str += st.charAt(i);
            currres = currres * 10 + (st.charAt(i) - '0');
            if(index==0){
                ans(i+1,st,target,str,ans,currres,currres);
            }
            else{
                ans(i+1,st,target,curr +"+"+ str,ans,currres,currres+res);
                ans(i+1,st,target,curr +"-"+ str,ans,-currres,res-currres);
                ans(i+1,st,target,curr +"*"+ str,ans,currres*prev,res-prev+(currres*prev));
                
            }
        }
    }
}