class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char c[] = t.toCharArray();
        boolean f = false;
        int x= ch.length;
        int n = c.length; 
        Arrays.sort(ch);
        Arrays.sort(c);
        if(Arrays.equals(ch,c)){
            f=true;
        }
        return f;
        
        
    }
}