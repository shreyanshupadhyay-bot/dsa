class Solution {
    public int countHillValley(int[] arr) {
        int n = arr.length;
        int hill=0;
        int valley=0;
        int arr1[] = new int[n];
        int c =0;
        arr1[c]=arr[0];
        for(int i=1;i<n;i++){
          if(arr[i]!=arr[i-1]){
            c++;
            arr1[c]=arr[i];
          }
          else{
            continue;
          }
    }
    int nums=0;
    for(int i =1;i<c;i++){
        if(arr1[i]>arr1[i-1]&&arr1[i]>arr1[i+1]){
            hill++;
        }
        else if(arr1[i]<arr1[i-1]&&arr1[i]<arr1[i+1]){
            valley++;
        }
        else{
            continue;
        }
    }
    return hill+valley;
    
    }
}