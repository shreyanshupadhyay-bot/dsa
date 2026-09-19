class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int maxs =0;
        List<Boolean> ans = new ArrayList();
        for(int i=0;i<candies.length;i++){
            maxs =Math.max(maxs,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extra)>=maxs){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
}