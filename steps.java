import java.util.HashMap;

public class steps {

    public static int ClimbStairs(int n){
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        int key = 0;
        HashMap<Integer, Integer> myHMap = new HashMap<Integer, Integer>();

        while(counter < n){
           
            myHMap.put(key, num1);
            int num3 = num1 + num2;
            //swap
            num1 = num2;
            num2 = num3;
            counter++;
            key++;
           
        }

        return(myHMap.get(n + 2));
    }
    public static void main(String[] args) {
        System.out.println(ClimbStairs(100));
    }
}
