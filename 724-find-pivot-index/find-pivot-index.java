class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int lefts = 0;
        for(int i=0;i<nums.length;i++){
            int rsum= total-lefts-nums[i];
            if(rsum==lefts){
                return i;
            }
            lefts +=nums[i];
        }
        return -1;
    }
}