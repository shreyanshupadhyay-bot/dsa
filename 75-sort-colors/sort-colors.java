class Solution {
    public void sortColors(int[] arr) {
        boolean sw;
        int s = 0;
        int e =arr.length;
        for(int i=0;i < e;i++){
            sw =false;
            for(int j=1;j<e-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sw =true;
                }
            }
            if(!sw){
                break;
            }
        }
    }
}