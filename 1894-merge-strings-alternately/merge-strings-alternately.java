class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str ="";
        int min = Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
            str += word1.charAt(i);
            str += word2.charAt(i);
        }
        int maxs =Math.max(word1.length(),word2.length());
        for(int j=min;j<maxs;j++){
            if(word1.length()>word2.length()){
                str += word1.charAt(j);
            }
            else{
                str +=word2.charAt(j);
            }
        }
        return str;
    }
}