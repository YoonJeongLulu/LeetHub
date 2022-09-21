class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int[][] ans = new int[r][c];

    if ((r == mat.length && c == mat[0].length) || r * c != mat.length * mat[0].length) return mat;

    int x = 0, y = 0; // x, y는 새로운 matrix용
    for (int i = 0; i < mat.length; i++){ //i, j는 원본 matrix용
      for (int j = 0; j < mat[0].length; j++){
        if (y == c) {
          x++; //column이 넘쳐버리면 x를 한칸 더 늘려야 함
          y = 0;
        }
        ans[x][y] = mat[i][j];

        y++;
      }
//      System.out.println(Arrays.deepToString(ans));
    }
    return ans;
    }
}