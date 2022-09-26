class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, String> map = new HashMap<String, String>();

        int i = 0;
        while (i < s.length()){
            if (map.containsKey(String.valueOf(s.charAt(i)))){
                if (!map.get(String.valueOf(s.charAt(i))).equals(String.valueOf(t.charAt(i)))){
                    return false;
                }
            }
            else{
                if (map.containsValue(String.valueOf(t.charAt(i)))) return false;
                map.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
            }
            i++;
        }
        return true;
    }
}