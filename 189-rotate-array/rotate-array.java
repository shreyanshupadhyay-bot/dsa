class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;        //Arrays.sort(arr);
        int first =0;
        int last =arr.length-1;
        rev(arr,first,last);
        rev(arr,first,k-1);
        rev(arr,k,last);
        System.out.print(Arrays.toString(arr));

    }
    static void rev(int arr[],int first,int last){
        while(first<last){
        int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
            
    }
    }
}