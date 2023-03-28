class Solution {
   public int solution(int i, int j, int k) {
    int count = 0;
    for (int n = i; n <= j; n++) {
        String number = String.valueOf(n);
        for (int m = 0; m < number.length(); m++) {
            if (number.charAt(m) == String.valueOf(k).charAt(0)) {
                count++;
            }
        }
    }
    return count;
}

}