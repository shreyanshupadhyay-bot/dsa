class Solution {
    public int[] shuffle(int[] nums, int n) {
        int v = nums.length;
        int arr[] = new int[nums.length];
        int even =0;
        int odd=1;
        for(int i =0;i<n;i++){
          arr[even]=nums[i];
          even+=2;
        }
        for(int k =n;k<v;k++){
            arr[odd]= nums[k];
            odd+=2;
        }
        return arr;
    }
}