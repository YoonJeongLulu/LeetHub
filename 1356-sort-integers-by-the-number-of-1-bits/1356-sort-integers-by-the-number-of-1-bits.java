class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
        Arrays.sort(a, (i, j) -> Integer.bitCount(i) != Integer.bitCount(j) ? Integer.bitCount(i) - Integer.bitCount(j) : i - j);
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        return arr;
    }
}