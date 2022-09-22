class Solution {
    public String freqAlphabets(String s) {
        String ans = "";
        int index = 0;
        while(index < s.length()){
          if(index < s.length() - 2 && s.charAt(index + 2) == '#'){
            int num = Integer.parseInt(s.substring(index, index + 2));
            ans += (char)(num + 96);
            index = index + 3;
            continue;
          }
          ans += (char)(97 + s.charAt(index) - '1');
          index++;
        }
        return ans;
    }
}