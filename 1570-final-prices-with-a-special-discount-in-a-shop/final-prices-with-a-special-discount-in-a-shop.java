class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[] = new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            int c=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    arr[i]=prices[i]-prices[j];
                    c=1;
                    break;
                }
            }
            if(c==0){
                arr[i]=prices[i];
            }
        }
        arr[prices.length-1] = prices[prices.length-1];
        return arr;
    }
}