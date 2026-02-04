class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int finals= 0;
        int arr[] = new int[nums.length+1];
        for(int i =1;i<=nums.length;i++){
            sum +=i;
            finals += nums[i-1];

        }
        return sum-finals;
       
    }
}