class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // int i=0;
        int ans=0;
        int count=1;
        for(int j=1;j<nums.length;j++){
            if(nums.length==0){
                return 0;
            }
            if(nums.length==1){
                count++;
            }
            if(nums[j]>nums[j-1]){
                count++;
            }
            else{
                
                ans=Math.max(ans,count);
                count=1;
                
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}