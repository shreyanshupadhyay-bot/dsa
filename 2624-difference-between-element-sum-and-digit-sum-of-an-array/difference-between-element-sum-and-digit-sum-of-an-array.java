class Solution {
    public int differenceOfSum(int[] nums) {
     int sum =0;
     int n = nums.length;
     int sum1=0;
     for(int i =0;i<n;i++){
        sum+=nums[i];
     }
     for(int i=0;i<n;i++){
        int k = nums[i];
        
        while(k>0){
            sum1+=k%10;
            k/=10;
        }
        }
        return sum-sum1;   
    }
}