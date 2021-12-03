//dfs

class floodFillSolution {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        if(image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int oldColor, int newColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor){
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, oldColor, newColor); //top
        fill(image, sr + 1, sc, oldColor, newColor); //bottom
        fill(image, sr, sc - 1, oldColor, newColor); //left
        fill(image, sr, sc + 1, oldColor, newColor); //right
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        floodFill(image, sr, sc, newColor);
    }
}
