class Solution {
    public boolean isPowerOfThree(int n) {
        // boolean ans= false;
        if(n==0||n<=-1){
            return false;
            
        }
            while(n%3==0){
                n= n/3;
                
        }
        return n==1;
        
       
    }
}