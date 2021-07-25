class Solution {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n){
        if(memo.get(n) != null){
            return memo.get(n);
        }
        if(n <= 1) return 1;
        memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return memo.get(n);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.climbStairs(4));
    }
}
