class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans = new HashSet<>();
        int max=0;
        int curr=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            while(ans.contains(s.charAt(i))){
                ans.remove(s.charAt(left));
                left++;
                curr--;
            }
           ans.add(s.charAt(i));
           curr++;
           max=Math.max(max,curr);     
    }
    return max;
    }
}