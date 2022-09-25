class Solution {
    public int pivotIndex(int[] nums) {
    int pivot = 0;
    int total_sum = Arrays.stream(nums).sum();
    
    for(int i = 0; i < nums.length; i++){
      int tmp_sum = 0;
      for (int j = 0; j < i ; j++){
        tmp_sum += nums[j];
      }

//      System.out.println("i: " + i + " tmp_sum: " + tmp_sum);
      if (tmp_sum == total_sum - tmp_sum - nums[i]){
        pivot = i;
        return pivot;
      };
    }
    return -1;
    }
}