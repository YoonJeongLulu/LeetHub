class Solution {
    public boolean isSubsequence(String s, String t) {

        String[] s_lt = s.split("");
        String[] t_lt = t.split("");

        if (s.length() == 0) return true;

        int index = 0;
        for(String each_t: t_lt){
           if (index == s_lt.length) return true;
           if(s_lt[index].equals(each_t)){
               index++;
           }
        }
        if (index == s_lt.length) return true;
        return false;
    }
}