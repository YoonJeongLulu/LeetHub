class Solution {
    public boolean isSubsequence(String s, String t) {

        String[] s_lt = s.split("");
        String[] t_lt = t.split("");
        System.out.println(s.length());
        
        if (s.length() == 0) return true;

        int index = 0, cnt = 0;
        for(String each_t: t_lt){
           if (cnt == s_lt.length) return true;
           if(s_lt[index].equals(each_t)){
               System.out.println("index: " + index + " s: " + s_lt[index] + " t: " + each_t);
               index++;
               cnt++;
           }
        }
        if (cnt == s_lt.length) return true;
        return false;
    }
}