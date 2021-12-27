class jumpGameSolution {

    public static boolean canJump(int[] nums){
        int lastGoodIndexPosition = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] + i >= lastGoodIndexPosition){
                lastGoodIndexPosition = i;
            }
        }

        return lastGoodIndexPosition == 0;
    }   
    
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
