class Solution {
    public int minimumChairs(String s) {
      int chair=0;
      int person=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='E' && person<chair){
            person++;
            continue;
        }
        else if(s.charAt(i)=='E' && person>=chair){
            chair++;
            person++;
        }
        else{
            person--;
        }
      }
      return chair;  
    }
}