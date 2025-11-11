class Solution {
    public int maxSubArray(int[] arr) {
        
        
        int maxs=arr[0];
        int sum =arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            maxs = Math.max(maxs, sum);
        }
        // System.out.println(maxs);
        return maxs;
    }
}