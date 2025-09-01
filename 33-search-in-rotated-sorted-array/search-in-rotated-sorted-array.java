class Solution {
    public int search(int[] arr, int target) {
        int start =0;
        int last =arr.length-1;
        while(start<=last){
            int mid =start+(last-start)/2;
             if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid]) {
                    last = mid - 1; // Search in left sorted half
                } else {
                    start = mid + 1; // Search in right half
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[last]) {
                    start = mid + 1; // Search in right sorted half
                } else {
                    last = mid - 1; // Search in left half
                }
            }
            
        }
        return -1;
    }
}