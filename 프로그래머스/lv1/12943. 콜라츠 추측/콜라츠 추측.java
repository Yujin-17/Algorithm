    class Solution {
        public long solution(long num) {
            long answer = 0;

            for(long i = 1; num != 1 && i <= 500; i++){
                if(num % 2== 0 && i != 500){
                    num = num /2;
                    answer = i;
                }else if(num % 2 != 0 && i != 500){
                    num = num * 3 + 1;
                    answer = i;
                }else if(i == 500){
                    answer = -1;
                }

            }



            return answer;
        }
    }