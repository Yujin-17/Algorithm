class Solution {
    public String solution(String my_string) {
        StringBuilder reversed = new StringBuilder();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            reversed.append(my_string.charAt(i));
        }
        return reversed.toString();
    }
}