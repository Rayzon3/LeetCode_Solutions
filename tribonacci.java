import java.util.HashMap;

class Tribonacci{

    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int trib(int n){
        if(memo.get(n) != null){
            return memo.get(n);
        }
        if(n == 0) return 0;
        if(n <= 2) return 1;
        memo.put(n, trib(n - 1) + trib(n - 2) + trib(n - 3));
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(trib(4));
    }
}
