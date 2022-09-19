class Solution {
    public int subtractProductAndSum(int n) {
        int producted = 1;
        int added = 0 ;
        int tmp_num = -1;

        while (n != 0) {
            tmp_num = n % 10;
            n /= 10;
            producted *= tmp_num;
            added += tmp_num;
        }

        return producted - added;
    }
}