class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left=0;
        int maxf=0;
        int maxwin=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxf = Math.max(maxf,freq[s.charAt(r)-'A']);
            int wind = r-left+1;
            if(wind-maxf>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            wind=r-left+1;
            maxwin=Math.max(maxwin,wind);

        }
        return maxwin;
    }
}