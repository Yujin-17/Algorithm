class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
                boolean a = signs[i];
                if(a == false){
                    int b = absolutes[i] * -1;
                    answer += b;
                    
                }else answer += absolutes[i];
                
            }
        
        return answer;
    }
}