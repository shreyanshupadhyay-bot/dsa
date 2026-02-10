class Solution {
    public int minElement(int[] nums) {
        int n =  nums.length;
        int arr[] = new int[n];

         for(int i =0;i<n;i++){
            
            int temp =0;
            int sum=0;
            while(nums[i]>0){
                temp=nums[i]%10;
                sum+=temp;
                nums[i]/=10;
            }
            arr[i]=sum;
         }
         int ans = arr[0];
         for(int i =1;i<n;i++){
            ans= Math.min(ans,arr[i]);
         }
         return ans;
    }
}