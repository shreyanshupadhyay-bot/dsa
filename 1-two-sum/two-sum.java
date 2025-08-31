class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] n = ans(arr,target);
        System.out.println(Arrays.toString(n));
        return n;
    }
    public static int[] ans(int[] arr,int target){
        int start =0;
        int end =arr.length;
        for(int i=0;i<end-1;i++){
            for(int j=1+i;j<end;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                    
                }
            }
        }
        return new int[]{-1,-1};
    }
}