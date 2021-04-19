public class NumberOfStepsToReduceToZero {
    public static int numberOfSteps(int num){
        int count = 0, q;
        while(true){
            if(num % 2 != 0){
                num--;
                count++;
            }
            q = num / 2;
            if(num == 0){
                break;
            }
            num = q;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
}
