class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
           for(int i = 0; i < numbers.length; i++){
            int a = numbers[i];

            for(int j = 0; j < 10; j++){
                int[] b = {0,1,2,3,4,5,6,7,8,9};
                if(a == b[j]){
                    answer += a;
                    
                }
                
            }

        }
        return 45 - answer;
    }
}