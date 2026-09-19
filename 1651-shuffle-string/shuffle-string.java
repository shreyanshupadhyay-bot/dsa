class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[] = new char[indices.length];
        String ans ="";
        for(int i=0;i<indices.length;i++){
            char ch = s.charAt(i);
            arr[indices[i]] = ch;
        }
       
        return new String(arr);
    }
}