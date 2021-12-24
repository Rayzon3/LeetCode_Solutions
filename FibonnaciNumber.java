import java.util.HashMap;

class Fibonacci{

    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int Fib(int n){
        if(memo.get(n) != null){
            return memo.get(n);
        }
        if(n == 0) return 0;
        if(n <= 2) return 1;
        memo.put(n, Fib(n - 1) + Fib(n - 2));
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(Fib(5));
    }
}
