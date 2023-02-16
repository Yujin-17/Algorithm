 class Solution {
        public boolean solution(String s) {
               boolean answer = false;
            char[] c = s.toCharArray();
            if(c.length == 4 || c.length == 6){
                answer = true;
            }
            if(c.length == 4 || c.length == 6){
                for(int i = 0; i < c.length;i++){
                    if(!(Character.isDigit(c[i]))){
                          answer = false;
                        break;

                    }
                    System.out.println(answer);
                }
            }

            return answer;
        }
    }