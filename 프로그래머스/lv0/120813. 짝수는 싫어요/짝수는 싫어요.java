import java.util.ArrayList;    
class Solution {
        public ArrayList solution(int n) {
            ArrayList answer = new ArrayList();
            
            for(int i = 0; i <= n; i++){
                if(i % 2 != 0){
                    answer.add(i);
                }
            }
            return answer;
        }
    }