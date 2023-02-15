class Solution {
      public long solution(int price, int money, int count) {
            long answer = 0;
            long a = 0;
            for(int i = 1; i <= count; i++){

                a += price * i;
                answer = money - a;
            }

            if(answer >= 0){
                return 0;
            }else return Math.abs(answer);
            
        }
}