class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resetSet = new HashSet<>();

        Arrays.sort(nums);

        for (int i=0; i < nums.length -2; i++) {

            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length -1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    resetSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                } else if (sum > 0) right--;
                    else left++;
            }
        }
        return new ArrayList<>(resetSet);
    }
}