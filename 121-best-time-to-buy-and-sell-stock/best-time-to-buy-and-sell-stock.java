class Solution {
    int maxProfit(int[] arr) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : arr) {
        if (price < minPrice) {
            minPrice = price;
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice;
        }
    }

    return maxProfit;
}

}