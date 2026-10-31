class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minl=Integer.MAX_VALUE;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
               int windlen=i-left+1;
                minl=Math.min(minl,windlen);
                sum-=nums[left];
                left++;
            }
        }
        if(minl==Integer.MAX_VALUE){
            return 0;
        }
        return minl;
    }
}