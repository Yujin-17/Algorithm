class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i <= n; i++) {
                if (i % 2 == 0 && i<n) {
                    answer += "수";
                } else if (i < n){
                    answer += "박";
            }else break;
            }
        return answer;
    }
}