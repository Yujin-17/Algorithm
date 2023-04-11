public class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        int index = -1; 

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == (char)(k + '0')) {
                index = i;
                break; 
            }
        }

        if (index == -1) { 
            return -1;
        } else {
            return index + 1; 
        }
    }
}
