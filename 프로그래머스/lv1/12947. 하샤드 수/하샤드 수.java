    class Solution {
        public boolean solution(int x) {
             boolean answer = true;
            int sum = 0;
            int c = x;
            while ( x > 0 ){
                sum += x % 10;
                x = x /10;
            }
            if(c % sum == 0){
                answer = true;
            }else if(c % sum != 0){
                answer = false;
            }
            return answer;
        }
    }