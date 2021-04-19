class soll{

    public static int maxProfit(int[] prices){

        if(prices.length == 1){
            return 0;
        }

        int profit = 0;
        boolean buy = true;
        boolean sell = false;
        boolean coolDown = false;

        for(int i = 0; i < prices.length; i++){
            if(buy == true && coolDown == false){
                profit = profit - prices[i];
                buy = false;
                sell = true;
                
            }
            else if(sell == true && i > 0){
                if(prices[i] > prices[i - 1]){
                    profit = profit + prices[i];
                    coolDown = true;
                    sell = false;
                }
            }
            else if(coolDown == true){
                buy = true;
                coolDown = false;
            }
        }

        return profit;

    }
    public static void main(String[] args) {
        int[] prices = {1};
        System.out.println(maxProfit(prices));
    }
}