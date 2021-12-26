class houseRobberIISolution {

    public static int rob(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int[] memo = new int[nums.length + 2];
        for(int i = nums.length - 2; i >= 0; i--){
            memo[i] = Math.max(memo[i + 2] + nums[i], memo[i + 1]);
        }

        int[] memo2 = new int[nums.length + 2];
        for(int i = nums.length - 1; i >= 1; i--){
            memo2[i] = Math.max(memo2[i + 2] + nums[i], memo2[i + 1]);
        }

        return Math.max(memo2[1], memo[0]);

    }

    public static void main(String[] args) {
        int nums[] = {2,3,2};
        System.out.println(rob(nums));
    }
}
