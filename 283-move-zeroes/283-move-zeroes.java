class Solution {
    public void moveZeroes(int[] nums) {
        int from = -1, to = -1;
        for(int i = 0 ; i < nums.length; i++){
            if (nums[i] == 0){
                from = i;
            }
            for (int j = i ; j < nums.length; j++){
                if (nums[j] != 0 && from > -1){
                    to = j;
                    nums[from] = nums[to];
                    nums[to] = 0;
                    from = -1;
                    to = -1;
                    break;
                }
            }
//            System.out.println(Arrays.toString(nums));
        }
        
    }
}