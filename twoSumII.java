public class twoSumII {

    public static int[] twoSum(int[] numbers, int target){
        int pointerOne = 0;
        int pointerTwo = numbers.length - 1;
        
        while(pointerOne < pointerTwo){
            int sum = numbers[pointerOne] + numbers[pointerTwo];

            if(sum > target){
                pointerTwo--;
            }
            else if(sum < target){
                pointerOne++;
            }
            else return new int[] {pointerOne + 1, pointerTwo + 1};
        }

        return new int[] {pointerOne + 1, pointerTwo + 1};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        twoSum(numbers, target);
    }
}
