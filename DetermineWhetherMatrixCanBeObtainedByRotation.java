import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int len = mat.length;
        int count = 0;

        while (count <= 3) {
            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][len - 1 - j];
                    mat[i][len - 1 - j] = temp;
                }
            }

            boolean check = Arrays.deepEquals(mat, target);
            if (check == true) {
                return check;
            }

            count++;
        }

        return false;
    }
}
