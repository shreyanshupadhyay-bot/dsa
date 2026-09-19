class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[] = new char[indices.length];
        String ans ="";
        for(int i=0;i<indices.length;i++){
            char ch = s.charAt(i);
            arr[indices[i]] = ch;
        }
        for(int j=0;j<indices.length;j++){
            ans += arr[j];
        }
        return ans;
    }
}