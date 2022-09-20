class Solution {
    public boolean isHappy(int n) {
    int sum = 0;
    ArrayList<Integer> arraylist = new ArrayList();

    while (true) {

      while (n != 0) {
        int tmp = n % 10;
        n = n / 10 ;
        sum += Math.pow(tmp, 2);
      }


      if (sum == 1) {
        return true;
      }
      else {
        if (arraylist.contains(sum)){
          break;
        }
        else{
          arraylist.add(sum);
          n = sum;
          sum = 0;
        }
      }
    }
    return false;
    }
}