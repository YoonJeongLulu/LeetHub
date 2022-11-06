class Solution{
public int[] searchRange(int[] nums, int target) {
    int l = binarySearch(nums, target);
    // target does not exist. No need to look for the last position.
    if (l == nums.length || nums[l] != target) return new int[] { -1, -1 };
    // look for the index of target + 1
    int r = binarySearch(nums, target + 1);
    // last position is r - 1.
    return new int[] { l, r - 1 };
}
private int binarySearch(int[] nums, int target) {
    int l = 0, r = nums.length;
    while (l < r) {
        int m = (l + r) / 2;
        if (nums[m] < target) l = m + 1;
        else r = m ;
    }
    return l;
}
}