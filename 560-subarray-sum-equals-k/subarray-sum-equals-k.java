class Solution {
    public int subarraySum(int[] arr, int k) {
        int maxs = arr[0];
        int sum =0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            int su = 0;
            for(int j=i;j<arr.length;j++){
                su+=arr[j];
                if(su==k){
                    count++;
                }
                
            }
        }
        return count;
    }
}