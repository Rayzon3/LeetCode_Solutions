import java.util.HashMap;

class twoSumSolution {

    public static int[] twoSum(int[] nums, int target){
        HashMap <Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(hmap.containsKey(x)){
                return new int[] {hmap.get(x), i}; 
            }
            hmap.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("Not found!");
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; 
        int target = 9;

        System.out.println(twoSum(nums, target));
    }
}
