class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    int[] givenNums; 
    public List<List<Integer>> permute(int[] nums) {
        this.givenNums = nums;
        backtrack(new ArrayList<>(), new boolean[nums.length]);
        return this.ans;
        
    }
    
    public void backtrack(List<Integer> path, boolean[] visited) {
        
        if (path.size() == visited.length) {
            this.ans.add(new ArrayList<Integer>(path));
        }
        
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            path.add(this.givenNums[i]);
            backtrack(path, visited);
            path.remove(path.size()-1);
            visited[i] = false;
        }
    }
}