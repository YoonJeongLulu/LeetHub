class Solution {
  public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
      int n = startTime.length;
      int[][] jobs = new int [n][3];
      
      for (int i=0; i < n; i++) {
          jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
      }
      
      Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
      
      TreeMap<Integer, Integer> tree = new TreeMap<>();
      
      tree.put(0, 0);
      
      for (int[] job: jobs) {
          int cur = job[2] + tree.floorEntry(job[0]).getValue();
          if (cur > tree.lastEntry().getValue()) {
              tree.put(job[1], cur);
          }
      }
    return tree.lastEntry().getValue();
      
  }
}