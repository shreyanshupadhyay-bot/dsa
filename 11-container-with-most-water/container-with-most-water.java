class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int count=height.length-1;
        int r=height.length-1;
        int ind=0;
        int ans=0;
        while(l<r){
            ind=Math.min(height[l],height[r]);
            ans=Math.max(ans,(count*ind));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
            count--;
        }
        return ans;
    }
}