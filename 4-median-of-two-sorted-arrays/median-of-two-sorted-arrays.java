class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n = nums2.length;
        int arr[]=new int[m+n];
        
        int i =0;
        int j =0;
        int c =0;
        
        double sum=0.0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                
                arr[c]=nums1[i];
                c++;
                i++;

            }
            else{
                
                arr[c]=nums2[j];
                c++;
                j++;
            }
            

        }
        while(i<m){
            arr[c]=nums1[i];
            c++;i++;
        }
        while(j<n){
            arr[c]=nums2[j];
            c++;j++;
        }
        int o = arr.length;
        if(o%2!=0){
            sum =  arr[o/2];
        }   
        else{
            sum=(arr[o/2]+arr[(o/2)-1])/2.0;
        }
        return sum;
    }
}