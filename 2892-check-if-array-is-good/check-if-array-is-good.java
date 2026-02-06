class Solution {
    public boolean isGood(int[] nums) {
     int n = nums.length;
     Arrays.sort(nums);
     boolean ans =false;
     int c=0;
     int cn =1;
     int l=0;
     int max=nums[n-1];
     int arr[] = new int[n];
     arr[0]=nums[0];
     for(int i =1;i<n;i++){
        if(nums[i]!=nums[i-1]){
            arr[cn]=nums[i];
            cn++;
        }
     }
     
     for(int i=0;i<cn-1;i++){
        if(arr[i]!=i+1){
            l+=1;
            break;
            
        }
     }
     for(int i =0;i<n;i++){
        if(nums[i]==max){
            c++;
        }
     }
     if(l>=1){
        ans= false;
     }
     else if(l==0){
      if(c==2&&n==max+1&&cn==max){
        ans=true;
     }
     }
     return ans;  
    }
}