public class containerWithMostWater {

    public static int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;

        while (low < high) {
            maxArea = Math.max(maxArea, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high])
                low++;
            else
                high--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
