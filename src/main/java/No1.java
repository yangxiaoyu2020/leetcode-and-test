class No1 {
    int[][] dirs = {{0,1}, {1,0}, {0, -1}, {-1, 0}};
    int[][] res;
    int n;
    public int[][] generateMatrix(int n) {
        this.n = n;
        this.res = new int[n][n];
        dfs(0, 0, 0, 1);
        return res;
    }

    private void dfs(int row, int col, int dir, int index) {
        res[row][col] = index;
        if (valid(row + dirs[dir][0], col + dirs[dir][1])) {
            dfs(row + dirs[dir][0], col + dirs[dir][1], dir, index+1);
        }
        else {
            dir = (dir+1) % 4;
            if (valid(row + dirs[dir][0], col + dirs[dir][1])) {
                dfs(row + dirs[dir][0], col + dirs[dir][1], dir, index+1);
            }
        }
    }

    private boolean valid(int x, int y) {
        return x>=0 && y>=0 && x < n && y < n && res[x][y] == 0;
    }


    public static void main(String[] args) {
        No1 firstSolution = new No1();
        pprint(firstSolution.generateMatrix(10));
    }

    private static void pprint(int[][] input) {
        if (input == null || input.length == 0) return;
        int n = input[0].length;
        for (int[] ints : input) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("\n");
        }
    }
}