class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int even =0;
        ;
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            if(nums[i]%2==0){
                arr[even]=nums[i];
                even++;
            }
        }
        
        for(int i=0;i<n;i++ ){
            if((nums[i]%2)!=0){
                arr[even]=nums[i];
                even++;
            }
        }
        return arr;
    }
}