class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if (nums.length < 3)
            return new ArrayList<>();
            
        Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(nums);

        for (int i=0; i < nums.length -2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            else {
                Map<Integer, Integer> temp = new HashMap<>();
                for (int j= i + 1; j < nums.length; j++) {
                    if (!temp.containsKey(nums[j])) {
                        temp.put(-nums[i]-nums[j], 0);
                    }
                    else {
                        resultSet.add(Arrays.asList(nums[i], -nums[i]-nums[j], nums[j]));
                    }
                }
            }

        }
        return new ArrayList<>(resultSet);
    }
}