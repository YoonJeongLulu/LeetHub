class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();

        Arrays.sort(nums);

        for (int i=0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length -1;

            if (i > 0 && nums[i-1] == nums[i]) continue;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                    if (left < right && nums[left-1] == nums[left]) left++;
                    if (left < right && nums[right+1] == nums[right]) right--;
                } else if (sum > 0) {
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}