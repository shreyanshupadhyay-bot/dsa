class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=-1;
        int sum=0;
        for(int i=0;i<=gas.length-1;i++){
        if(sum+gas[i]>=cost[i]){
            sum=sum+gas[i]-cost[i];
            if(index==-1){
            index=i;
            }
        }
        else{
            index=-1;
            sum=0;
        }
    }
    for(int i =0;i<=index;i++){
        if(sum+gas[i]>=cost[i]){
            sum=sum+gas[i]-cost[i];
        }
        else{
            index=-1;
            sum=0;
        }
    }
    return index;
}
}