class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ar = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int an  = ans(i);
            if(an==-1){
                continue;
            }
            else{
                ar.add(an);
            }
        }
        return ar;
    }
     public int ans(int val){
    int ls =0;
    int tem = val;
    while(tem!=0){
        int temp = tem%10;
        tem/=10;
        if(temp==0){
            return -1;
        }
        else if(val%temp==0){
            ls = 1;
        }
        else if(val%temp!=0){
            return -1;
        }
    }
    
        return val;
    
    }
}