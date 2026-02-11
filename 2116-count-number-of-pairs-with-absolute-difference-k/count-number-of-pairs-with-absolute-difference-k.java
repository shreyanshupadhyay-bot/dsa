class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans =0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =1+i;j<n;j++){
                // if(nums[i]>nums[j]){
                    if(nums[i]-nums[j]==k){

                    ans++;
                }
                    else if (nums[i]-nums[j]==(k*-1)){
                        ans++;
                    }
                    else{continue;}
                }
            
        }
        return ans;
    }
}