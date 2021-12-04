class maxAreaOfIslandSolution {

    static boolean traversed[][];

    public static int area(int row, int col, int[][] grid){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || traversed[row][col] || (grid[row][col] == 0)){
            return 0;
        }

        traversed[row][col] = true;
        return (1 + area(row + 1, col, grid) + area(row - 1, col, grid) + area(row, col + 1, grid) + area(row, col - 1, grid));
    }


    public static int maxAreaOfIsland(int[][] grid){
        int max = 0;
        int row = grid.length;
        int col = grid[0].length;

        traversed = new boolean[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                max = Math.max(max, area(i, j, grid));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid));
    }
}
