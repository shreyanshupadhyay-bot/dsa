class Solution {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);

        int n =arr.length;
        int count=1;
        int ans=arr[n-1];
        for(int i =n-2;i>=0;i--){
            if(count<3){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                count++;
                ans=arr[i];
            }
            }
            if(count==3){
            return arr[i];
            }
        }
        return arr[n-1];
    }
}