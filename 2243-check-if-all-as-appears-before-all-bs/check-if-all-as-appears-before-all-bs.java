class Solution {
    public boolean checkString(String s) {
        char arr[] = s.toCharArray();
        boolean ans=true;
        for(int i =arr.length-1;i>0;i--){
            if(arr[i]=='a'&&arr[i]!=arr[i-1]){
                ans=false;
                break;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}