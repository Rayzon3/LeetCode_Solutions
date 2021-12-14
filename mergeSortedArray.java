class mergeSortedArraySolution {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        if(n == 0 && m == 0) return;

        int pointerOne = m - 1;
        int pointerTwo = n - 1;
        int i = m + n -1;

        while(pointerTwo >= 0){
            if(pointerOne >= 0 && nums1[pointerOne] > nums2[pointerTwo]){
                nums1[i] = nums1[pointerOne];
                i--;
                pointerOne--;
            }
            else{
                nums1[i] = nums2[pointerTwo];        
                i--;
                pointerTwo--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3;
        int[] nums2 = {2,5,6}; 
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}
