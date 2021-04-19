public class SmallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] list = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            list[i] = count;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }
}
