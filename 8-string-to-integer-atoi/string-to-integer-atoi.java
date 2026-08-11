class Solution {
    public int myAtoi(String s) {
       
        
        int n = s.length();
        int res=0;
        int sign =1;
        int index=0;
        int digit =0;
        while(index<n&&s.charAt(index)==' '){
        index+=1;
        }
        if(index<n &&s.charAt(index)=='-'){
            sign=-1;
            index+=1;
        }
        else if(index<n &&s.charAt(index)=='+'){
            index++;
        }
        while(index<n && flag(s.charAt(index))>=0 && flag(s.charAt(index))<=9){
            digit=flag(s.charAt(index));
           if(res==Integer.MAX_VALUE/10){
            if(sign==1){
                if(digit>=7){
                    return Integer.MAX_VALUE;
                }
            }
            else if(sign==-1){
                if(digit>=8){
                    return Integer.MIN_VALUE;
                }
            }
           }
           if(res>Integer.MAX_VALUE/10){
            if(sign==1){
                return Integer.MAX_VALUE;
            }
            else{
                return Integer.MIN_VALUE;
            }
           }
           res=res*10+digit;
           index++;

        }
        return res  *=sign;

    
    }
     private int flag(char ch){
            if(ch>='0'&&ch<='9'){
                return  ch -'0';
            }
            else{
                return -1;
            }
}
}