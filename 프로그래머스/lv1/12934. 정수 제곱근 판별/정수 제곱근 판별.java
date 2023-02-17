    class Solution {
        public long solution(long n) {
            long answer = 0;

            double result = Math.sqrt((n));
            int result2 = (int)Math.round(result);

            if(result2 != Math.sqrt(n) || n <= 0){
                answer = -1;
            }else {
                int a = (int)Math.sqrt(n+1);
                answer = (long)Math.pow(a+1,2);
            }

            return answer;
        }
    }