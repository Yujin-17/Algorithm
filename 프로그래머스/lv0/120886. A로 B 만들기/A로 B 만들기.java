public class Solution {
    public int solution(String before, String after) {
        if (before.length() != after.length()) {
            return 0;
        }

        int[] beforeCharCount = new int[26]; 
        int[] afterCharCount = new int[26];

        for (int i = 0; i < before.length(); i++) {
            beforeCharCount[before.charAt(i) - 'a']++; 
            afterCharCount[after.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (beforeCharCount[i] != afterCharCount[i]) {
                return 0;
            }
        }

        return 1;
    }
}
