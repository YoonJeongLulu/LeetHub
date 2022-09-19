class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1, add = 0, tmp = -1;

        while (n != 0) {
            tmp = n % 10;
            n /= 10;
            mul *= tmp;
            add += tmp;
        }

        return mul - add;
    }
}