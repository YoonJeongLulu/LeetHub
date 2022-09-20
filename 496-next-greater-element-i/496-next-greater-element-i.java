class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i=0 ; i < nums1.length; i++ ){
            int pivot = nums1[i];
            boolean breakPoint = false;
            boolean isGreater = false;
            for (int j=0 ; j < nums2.length; j++) {
                if (breakPoint && pivot < nums2[j]){
                    ans[i] = nums2[j];
                    isGreater = true;
                    break;
                }
                if (pivot == nums2[j]){
                    breakPoint = true;
                }
            }
            if (!isGreater){
                ans[i] = -1;
            }
        }
        return ans;
    }
}