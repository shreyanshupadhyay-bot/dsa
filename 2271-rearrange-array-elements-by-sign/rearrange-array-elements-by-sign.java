class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int r = 0;
        int s=0;
        int k =0;
        int l=0;
        int result[] = new int[n];
        int res[] = new int[n];
        int finals[] = new int[n];
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                result[r] = nums[i];
                r++;    
            }
            }
        
        for(int i= 0; i<n; i++){
            if(nums[i]<0){
                res[s] = nums[i];
                s++;
            }
        }
        for(int i=0;i<n;i++){
            if(i%2!=0){
                finals[i]=res[k];
                k++;
            }
            else{
                finals[i]=result[l];
                l++;
            }
        }
        return finals;    
    }
}