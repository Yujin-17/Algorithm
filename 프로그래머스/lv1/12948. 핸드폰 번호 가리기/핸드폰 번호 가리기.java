    class Solution {
        public String solution(String phone_number) {
            String answer = "";

            String b = phone_number.substring(phone_number.length()-4,phone_number.length());
            String a = phone_number.substring(0,phone_number.length()-4);
            for(int i = 0; i < phone_number.length()-4; i++)
            {
                answer += '*';
            }
            answer += b;
            return answer;
        }
    }