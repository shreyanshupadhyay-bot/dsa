class Solution {
    public int numJewelsInStones(String jew, String stones) {
        int c=0;
        for(int i=0;i<jew.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jew.charAt(i)==stones.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}