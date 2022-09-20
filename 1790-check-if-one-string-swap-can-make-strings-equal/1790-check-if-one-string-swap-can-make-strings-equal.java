class Solution {
  public boolean areAlmostEqual(String s1, String s2) {

    String[] words1 = s1.split("");
    String[] words2 = s2.split("");

    int idx1 = -1, idx2 = -1;
    for (int i = 0; i < words1.length; i++) {
      System.out.println("words1: " + words1[i] + " words2: " + words2[i]);
      if (!words1[i].equals(words2[i])) {
        if (idx1 == -1) {
          idx1 = i;
          System.out.println("index: " + i + " idx1: " + idx1);
        } else if (idx2 == -1) {
          idx2 = i;
          System.out.println("index: " + i + " idx2: " + idx2);
        } else {
          return false;
        }
      }
    }

    if (idx1 < 0 && idx2 < 0) return true;
    if (idx2 < 0) return false;
    if (words1[idx1].equals(words2[idx2]) && words1[idx2].equals(words2[idx1])) return true;
    return false;
  }
}