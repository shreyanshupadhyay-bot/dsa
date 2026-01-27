class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxs =0;
        for(int i =0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<=accounts[i].length-1;j++){
                sum +=accounts[i][j];
            }
            if(maxs<sum){
                maxs=sum;
            }

        }
        return maxs;
    }
}