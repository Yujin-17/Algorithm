    class Solution {
        public String solution(String rsp) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            char[] b = new char[rsp.length()];
            char[] c = rsp.toCharArray();
            for(int i = 0; i < c.length; i++){
                if(c[i] == '2'){
                    b[i] = '0';
                }else if(c[i] == '0'){
                    b[i] = '5';
                }else b[i] = '2';
            }

            answer = String.valueOf(b);
            return answer;
        }
    }