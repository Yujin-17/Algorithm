    class Solution {
        public String solution(String s) {
            String answer = "";
            char[] c = s.toCharArray();
            int idx = 0;
            for(int i = 0; i < s.length(); i++){
                char b = c[i];
                if(idx % 2 == 0 && c[i] != ' '){
                   answer += Character.toUpperCase(b);
                   idx++;
                    System.out.println(answer);
                }else if(idx % 2 == 1 && c[i] != ' '){
                    answer += Character.toLowerCase(b);
                    idx++;
                }else if(c[i] == ' '){
                    answer += ' ';
                    idx = 0;
                }

            }
            return answer;
        }
    }