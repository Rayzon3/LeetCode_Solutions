public class RichestCustomer {
    public static int maxWealth(int[][] accounts){
        int sum = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[j].length; j++){
                sum = accounts[i][j] + sum;
            }
        }
        return sum;
    }
    public static void main(String[] args) { 
        int[][] acc = {{1,2,3},{3,2,1}};
        System.out.println(maxWealth(acc));
    }
}
