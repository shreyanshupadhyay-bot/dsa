class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans =Integer.MAX_VALUE;
        int k=0;
        int temp=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                k=i;
                temp=Math.abs(k-start);
                ans=Math.min(ans,temp);
            }
        }
        return ans;

    }
}