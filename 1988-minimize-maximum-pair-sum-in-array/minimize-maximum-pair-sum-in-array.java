class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        int left =0;
        int right = n;
        int arr[] = new int[2];
        int maxs=0;
       while(left<right){
        int sum =0;
        if((nums[left]+nums[right])>maxs){
            maxs= nums[left]+nums[right];
            left++;
            right--;
        }
        else{
            left++;
            right--;
        }
       }
       return maxs;
    }
}