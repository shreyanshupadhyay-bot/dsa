class Solution {
    public boolean search(int[] arr, int target) {
        int start=0;
        int end =arr.length;
        for(int i=0;i<end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}