class Solution {
    public int minMoves(int[] nums) {
        int maxs=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            maxs=Math.max(maxs,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            c += maxs-nums[i];
        }
        return c;
    }
}