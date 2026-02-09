class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n*2];
        int c =0;
        for(int i =0;i<n;i++){
            arr[c]=nums[i];
            c++;
        }
        for(int i =0;i<n;i++){
            arr[c]=nums[i];
            c++;
        }
        return arr;
    }
}