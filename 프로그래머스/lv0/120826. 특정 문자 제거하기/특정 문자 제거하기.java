class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder le = new StringBuilder(letter);
        for (int i = 0; i < sb.length(); i++) {
            for(int j = 0; j < le.length(); j++){
                   if (sb.charAt(i) == le.charAt(j)) {
                sb.deleteCharAt(i);
                i--;
            }
            }
         
        }
        
        return sb.toString();
    }
}