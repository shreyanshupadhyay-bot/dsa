class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int n = arr.length;
        List<List<Integer>> list=new ArrayList<>();
        for(int j =1;j<n;j++){
            diff=Math.min(diff,arr[j]-arr[j-1]);
        }
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==diff){
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return list;
    }
}