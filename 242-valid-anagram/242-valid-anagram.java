class Solution {
    public boolean isAnagram(String s, String t) {
        String[] s_arr = s.split("");
        String[] t_arr = t.split("");

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        
        if (s_arr.length != t_arr.length) return false;

        int i = 0;
        while(i < s_arr.length){
            if (!s_arr[i].equals(t_arr[i])) return false;
            i++;
        }

        return true;
    }
}