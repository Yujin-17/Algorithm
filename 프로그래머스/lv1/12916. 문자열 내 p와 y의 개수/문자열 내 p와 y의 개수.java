class Solution {
      boolean solution(String s) {
            boolean answer = true;
            char[] charArr = s.toCharArray();
            int num1 = 0;
            int num2 = 0;
            for(int i = 0; i < s.length(); i++){
                if(charArr[i] == 'y' || charArr[i] =='Y' ){
                    num1++;
                }else if(charArr[i] == 'P' || charArr[i] =='p' ){
                    num2++;
                }
                
            } if(num1 != num2){
                answer = false;
            }
            
            

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            return answer;
        }
}