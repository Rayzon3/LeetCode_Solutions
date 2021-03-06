//catalan numbers

class uniqueBinarySearchTressSolution {

    public static int numTrees(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= i - 1; j++){
                dp[i] = dp[i] + dp[j] * dp[i - 1 - j];
            }
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(n));
    }
}
