class Solution {
  public int[] runningSum(int[] nums) {

    Integer[] ans = new Integer[nums.length];

    ans[0] = nums[0];

    for (int i = 1; i < nums.length; i++){
      ans[i] =  nums[i] + ans[i-1];
    }

    for (int i = 1; i < nums.length; i++){
      nums[i] =  ans[i];
    }

    return nums;
  }
}