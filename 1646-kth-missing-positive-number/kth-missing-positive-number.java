class Solution {
    public int findKthPositive(int[] arr, int j) {
        int arr2[] = new int[j];
        int count =0;
        int ans =0;
        for(int i =1;i<=arr[arr.length-1]+j;i++){
            int con =0;
            for(int k =0;k<arr.length;k++){
              if(i==arr[k]){
                con++;
                break;
              }
              else{
                continue;
              }
        }
        if(count<j){
            
            if(con==0){
            arr2[count]=i;
            count++;
        }

        }
        else{
            break;
        }
        }
    return arr2[j-1];
    }
}