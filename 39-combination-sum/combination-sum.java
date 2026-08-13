class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        back(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
    void back(int st,int targ,int[] can,List<Integer> curr,List<List<Integer>> ans){
        
        if(targ==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(targ<0){
            return;
        }
        for(int i  =st;i<can.length;i++){
            curr.add(can[i]);
        
            back(i,targ-can[i],can,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}