class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> str =  new HashSet<>();
        char ch ='0';
        for(int i=0;i<s.length();i++){
            if(str.contains(s.charAt(i))){
                ch=s.charAt(i);
                break;
            }
            else{
                str.add(s.charAt(i));
            }
        }
        return ch;
    }
}