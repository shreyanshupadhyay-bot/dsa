class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                 nums[count]=nums[i];
                count++;
            }
            else{
                continue;
            }
            
            
        }
        return count;
    }
}