class minCostClimbingStairsSolution {
    public static int minCostClimbingStairs(int[] cost) {
        int step_1 = 0;
        int step_2 = 0;
        for(int i = cost.length - 1; i >= 0; i--){
            int currentStep = cost[i] + Math.min(step_1, step_2);
            step_1 = step_2;
            step_2 = currentStep; 
        }

        return Math.min(step_1, step_2);
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
