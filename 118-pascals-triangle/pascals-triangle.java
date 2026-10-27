class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fans = new ArrayList<>();
        for(int j=1;j<=numRows;j++){
            fans.add(ncr(j));
        }
        return fans;
    }
    public List<Integer> ncr(int row){
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        long ans=1;
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans = ans/i;
            temp.add((int)ans);
        }
        return temp;
    }
}