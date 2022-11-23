class Solution {

    int m;
    int n;

    public List<Integer> spiralOrder(int[][] matrix) {
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        this.m = matrix.length;
        this.n = matrix[0].length;
        
        boolean[][] visited = new boolean[this.m][this.n];
        List<Integer> result= new ArrayList<>();
        
        int end = 1;
        int x = 0, y = 0;
        int idx = 0;
        result.add(matrix[0][0]);
        
        while (true) {
            if (end == this.m*this.n) break;

            visited[x][y] = true;
            
            int new_x = x + dx[idx%4];
            int new_y = y + dy[idx%4];
            
            
            if (go_outside(new_x, new_y)) {
                idx++;
                continue;
            }
            
            if (visited[new_x][new_y]) {
                idx++;
                continue;
            }
            result.add(matrix[new_x][new_y]);
            x = new_x;     
            y = new_y;
            end++;
        }
        
        return result;
        }
    
    
    public boolean go_outside(int i, int j) {
        if (i < 0 || i >= this.m || j < 0 || j >= this.n) {
            return true;
        }
        return false;
    }

}