class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            for (int j = 1; j < n; j++) {
                sb.insert(i + 1, c);
                i++;
            }
        }
        
        return sb.toString();
    }
}
