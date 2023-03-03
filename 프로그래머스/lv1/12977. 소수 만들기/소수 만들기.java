import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 3중 for문을 사용하여 nums에서 서로 다른 3개를 골라 더함
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 소수인지 체크하는 함수를 호출하여 소수인 경우 answer 증가
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    // 소수 체크 함수
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
