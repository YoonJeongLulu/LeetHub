class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // x = n선 판별용
        int cnt = 0;
        for (int x = 1; x < coordinates.length; x++){
            if (coordinates[x][0] == coordinates[x-1][0]) {
                cnt += 1;
            }
        }

        if (cnt == coordinates.length - 1){// x = n이 맞음
            return true;
        }

        if (cnt > 0) { // x값 몇 개만 같기에 Division error 발생
            return false;
        }

        float y_diff = coordinates[1][1] - coordinates[0][1];
        float x_diff = (coordinates[1][0] - coordinates[0][0]);
        float inclination = y_diff/x_diff;
        for(int i = 2 ; i < coordinates.length; i++){
            float y_diff_tmp = coordinates[i][1] - coordinates[i-1][1];
            float x_diff_tmp = coordinates[i][0] - coordinates[i-1][0];
            float inclination_tmp = y_diff_tmp/x_diff_tmp;
            System.out.println(inclination);
            System.out.println(inclination_tmp);
            if (inclination_tmp != inclination) return false;
    }
        return true;
}
}