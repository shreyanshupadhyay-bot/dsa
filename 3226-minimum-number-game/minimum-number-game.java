class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int odd=1;
        int even =0;
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            if(i%2!=0){
                arr[even]=nums[i];
                even+=2;
            }
            else{
                arr[odd]=nums[i];
                odd+=2;
            }
        }
        return arr;
    }
}