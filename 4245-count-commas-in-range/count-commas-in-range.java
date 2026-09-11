class Solution {
    public int countCommas(int n) {
        int count=0;
        int x=1000;
    if(n<1000){
        return 0;
    }
        return (n-x)+1;
    }
}