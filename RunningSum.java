public class RunningSum {

    static public int[] runningSum(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};

        runningSum(a);
    }
}
