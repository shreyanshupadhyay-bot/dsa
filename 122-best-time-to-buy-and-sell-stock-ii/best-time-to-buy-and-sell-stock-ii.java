class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int sum =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                sum += arr[i]-arr[i-1];
            }
            else{
                continue;
            }
        }
        return sum;
    }
}