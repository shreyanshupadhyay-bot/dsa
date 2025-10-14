class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        int first = 0;
        int maxsum = 1;
        int s =1;
        Arrays.sort(arr);
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                s++;
            }
            else if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                if(maxsum<s){
                    maxsum=s;
                }
                s=1;
            }
            if(maxsum<s){
                maxsum=s;
            }
        }
        return maxsum;
    }
}