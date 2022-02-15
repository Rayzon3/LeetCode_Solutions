class singleNumberSolution {

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans ^= i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));
    }
}
