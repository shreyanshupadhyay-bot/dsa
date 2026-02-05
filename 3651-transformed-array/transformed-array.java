class Solution {
    public int[] constructTransformedArray(int[] arr) {
        int n = arr.length-1;
        int arr2[]= new int[n+1];
        for(int i =0;i<arr.length;i++){
            int c = arr[i];
            int st=i;
            if(arr[i]==0){
                arr2[i]=arr[i];
            }
            else if(arr[i]>0){
                while(c>0){
                    if(st==n){
                        st=-1;
                        st++;
                        c--;
                    }
                    else{
                    st++;
                
                    c--;
                    }
                }
                arr2[i]=arr[st];
            }
            else{
                while(c<0){
                    if(st==0){
                        st=n+1;
                        st--;
                        c++;
                    }
                    else{
                    st--;
                    c++;
                    }
                }
                arr2[i]=arr[st];
            }
        }
        return arr2;
    }
}