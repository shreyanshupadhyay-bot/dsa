class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> k = new ArrayList<>();
         ans(0,nums,new ArrayList<>(),k);
         return k;
    }
    void ans(int st,int [] nums,List<Integer> curr,List<List<Integer>> finals){
           finals.add(new ArrayList<>(curr));   
        for(int i  =st;i<nums.length;i++){
            curr.add(nums[i]);
            ans(i+1,nums,curr,finals);
            curr.remove(curr.size()-1);
        }
    }
}