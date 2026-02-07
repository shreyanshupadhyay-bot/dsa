class Solution {
    public int minimumDeletions(String s) {
        char arr[] = s.toCharArray();
        int count =0;
        int ns=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='b'){
                count++;
            }
            else{
                ns=Math.min(ns+1,count);
            }
        }
        return ns;
    }
}