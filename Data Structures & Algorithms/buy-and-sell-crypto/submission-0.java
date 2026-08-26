class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxPro = 0;
        int minPrice = prices[0];
        for (int price : prices){
            if(price < minPrice){
                minPrice = price;
            } else if(price - minPrice > maxPro){
                maxPro = price - minPrice;
            }
        }
        return maxPro;
    }
}
