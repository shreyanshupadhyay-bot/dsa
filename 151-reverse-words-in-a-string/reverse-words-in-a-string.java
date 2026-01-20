class Solution {
    public String reverseWords(String s) {
       String arr[] = s.trim().split("\\s+");
        int x = arr.length-1;
        StringBuilder str = new StringBuilder();

    //   StringBuilder str = new StringBuilder();
      for(int i=x;i>=0;i--){
        str.append(arr[i]+" ");
      }
      return str.toString().trim();

    }
}