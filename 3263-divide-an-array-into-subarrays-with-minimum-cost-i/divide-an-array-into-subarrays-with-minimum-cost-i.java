class Solution {
    public int minimumCost(int[] nums) {
       int n = nums[0];
       int arr[] = new int[nums.length-1];
       int count =0;
       int k =0;
       for(int i =0;i<nums.length;i++){
        if(n==nums[i]&& count<1){
            count++;
            continue;
        }
        else{
            arr[k]=nums[i];
            k++;
        }
       }
       Arrays.sort(arr);
       n = n+arr[0];
       int min = Integer.MAX_VALUE;
       for(int i =1;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }
       }
       n += min;
       return n;
    }
}