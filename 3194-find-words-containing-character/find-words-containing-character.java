class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls = new ArrayList<>();  
        for(int i =0;i<words.length;i++){
            String ans = words[i];
            if(ans.indexOf(x)!=-1){
                ls.add(i);
            }
        }
        return ls;  
        }
}