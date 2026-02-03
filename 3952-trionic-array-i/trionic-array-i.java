class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p=0;
        int q =0;
        int count =0;
        int c =0;
        int counts =0;
        boolean ans = false;
        if(nums.length<=3){
            return false;
        }
        for(int i =1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
                continue;
            }
            else{
                if(count>=1){
                ans =true;
                p=i;
                break;
                }
                else{
                    
                    return false;
                    
                }
            }
        }
        if(count<1) return false;
        for(int j=Math.max(p,1);j<nums.length;j++){
            if(nums[j]<nums[j-1]){
                c++;
                continue;
            }
            else{
                if(c>=1){
                    ans =true;
                    q=j;
                    break;
                }
                else{
                    
                    return false;
                }

            }
        }
        if(c<1) return false;
        if(q==0){
            return false;
        }
        for(int k =Math.max(q,1);k<nums.length;k++){
            if(nums[k]>nums[k-1]){
                counts++;
                
            }
            
                else{
                    
                    return false;
                    
                }
            
        }

        if(counts<1) return false;
        
        
        return true;
    }
}