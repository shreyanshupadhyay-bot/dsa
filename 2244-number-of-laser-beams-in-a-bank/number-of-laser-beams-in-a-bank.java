class Solution {
    public int numberOfBeams(String[] bank) {
        int var1=0;
        int var2=0;
        for(int i=0;i<bank.length;i++){
            char arr[] = bank[i].toCharArray();
            int sum =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]=='1'){
                    sum++;
                }
            }
            if(sum>0){
            var1 += (var2*sum);
            var2=sum;
            }
        }
        return var1;
}
}