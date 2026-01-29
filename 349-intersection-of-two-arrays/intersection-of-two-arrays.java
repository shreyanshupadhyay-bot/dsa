class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int arr[] = new int[nums1.length];
       
    
        int count =1;
        for(int i=1;i<nums1.length;i++){
            if(nums1[i]==nums1[i-1]){
                continue;
            }
            else{
                arr[count]=nums1[i];
                count++;
            }
        }
        arr[0]=nums1[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<count;i++){
            int s =0;
            for(int j=0;j<nums2.length;j++){
                if(arr[i] == nums2[j]){
                    s++;
                }
                else{
                    continue;
                }
            }
            if(s>0){
                list.add(arr[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}