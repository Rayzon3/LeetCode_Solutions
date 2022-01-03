class longestContinuousIncreasingSubArraySolution {

    public static int findLengthOfLCIS(int[] nums){
        int len = 0;
        int anchor = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i - 1] >= nums[i]) anchor = i;
            len = Math.max(len, i - anchor +  1);
        }

        return len;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
