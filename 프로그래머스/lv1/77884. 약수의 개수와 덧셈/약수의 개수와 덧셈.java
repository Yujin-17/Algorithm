class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int a = 0;
        for( int i = left; i <= right; i++){
            for(int j = 1 ; j <= i; j++){
                if(i % j == 0){
                    a += 1;
                }  
            }if(a % 2 == 0){
                    answer += i;
                    a = 0;
                    }else {
                    answer -= i;
                    a= 0;
                }
             
        }
        
        
        return answer;
    }
}