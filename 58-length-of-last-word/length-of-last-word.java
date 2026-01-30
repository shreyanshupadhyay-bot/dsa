class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.trim().split("\\s+");
        String st = arr[arr.length-1];
        int len = st.length();
        return len;
    }
}