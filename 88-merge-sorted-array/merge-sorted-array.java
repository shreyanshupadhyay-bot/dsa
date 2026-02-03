class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]= new int[m+n];
        int count =0;
        int mount=0;
        for(int i =0;i<nums1.length;i++){
            if(count<m&&mount<n){
            if(nums1[count]<nums2[mount]){
                arr[i]=nums1[count];
                count++;
            
            }
            else{
                
                arr[i]=nums2[mount];
                mount++;
            }
        }
        else if(count<m){
            arr[i]=nums1[count];
            count++;
        }
        else{
            arr[i]=nums2[mount];
            mount++;
        }
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
    }
}
