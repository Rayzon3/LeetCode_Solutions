//need to use in-place sorting algorithm

class sortColorsSolution {

    public static void sortColors(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return;

        int start = 0;
        int end = nums.length - 1;
        int current = 0;

        while (current <= end && start < end) {
            if (nums[current] == 0) {
                nums[current] = nums[start];
                nums[start] = 0;
                start++;
                current++;
            } else if (nums[current] == 2) {
                nums[current] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                current++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }
}
