class Solution {
    public String mergeAlternately(String word1, String word2) {
    String[] word1Arr = word1.split("");
    String[] word2Arr = word2.split("");

    ArrayList<String> ansList = new ArrayList<String>();

    if(word2Arr.length - word1Arr.length > 0){
      for (int i = 0; i < word1Arr.length; i++){
        ansList.add(word1Arr[i]);
        ansList.add(word2Arr[i]);
      }

      for (int j=word1Arr.length; j < word2Arr.length; j++){
        ansList.add(word2Arr[j]);
      }
    } else{
      for (int i = 0; i < word2Arr.length; i++){
        ansList.add(word1Arr[i]);
        ansList.add(word2Arr[i]);
      }
      for (int j=word2Arr.length; j < word1Arr.length; j++){
        ansList.add(word1Arr[j]);
      }
    }
    
    String ans = "";
    for(String item: ansList){
      ans += item;
    }
    return ans;
    }
}