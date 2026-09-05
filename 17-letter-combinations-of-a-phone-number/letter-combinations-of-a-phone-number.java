class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
            return ans;
        }
        ans(0,digits,new ArrayList<>(),arr,ans);
        return ans;
    }
    void ans(int ind,String digit,List<Character> curr, String arr[] ,List<String> ans){
        if(ind==digit.length()){
            String s ="";
            for(char c:curr){
                s+=c;}
            ans.add(s);
            return;
        }
        String letter = arr[digit.charAt(ind)-'0'];
        for(int i =0;i<letter.length();i++){
            curr.add(letter.charAt(i));
            ans(ind+1,digit,curr,arr,ans);
            curr.remove(curr.size()-1);
        }
    }
}