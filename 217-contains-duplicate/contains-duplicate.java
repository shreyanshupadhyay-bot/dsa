class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length-1;
        boolean flag = false;
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            if(nums[i]==nums[i-1]){
                flag = true;

            }
            
        }
        return flag;
    }
}