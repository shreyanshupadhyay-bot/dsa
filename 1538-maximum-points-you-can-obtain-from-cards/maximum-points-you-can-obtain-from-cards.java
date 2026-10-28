class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=cardPoints.length;
        int sum=0;
        for(int i:cardPoints){
            sum+=i;
        }
        if(l==k){
            return sum;
        }
        int window=0;
        int ans =0;
        for(int i=0;i<l-k-1;i++){
            window+=cardPoints[i];
        }
        for(int j=l-k-1;j<l;j++){
            window+=cardPoints[j];
            ans=Math.max(ans,sum-window);
            window -= cardPoints[j-(l-k-1)];
        }
        return ans;
    }
}