public class ShuffleOfTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] list;
        list = new int[nums.length];
        int index_one, i = 0;
        int index_two = n;

        for(index_one = 0; index_one <= n - 1; index_one++){
            list[i] = nums[index_one];
            i++;
            list[i] = nums[index_two];
            index_two++;
            i++;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(shuffle(nums, n));
    }
}
