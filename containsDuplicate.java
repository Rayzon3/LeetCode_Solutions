import java.util.HashSet;

class containsDuplicateSolution {

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(myHashSet.contains(nums[i])) return true;
            myHashSet.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
