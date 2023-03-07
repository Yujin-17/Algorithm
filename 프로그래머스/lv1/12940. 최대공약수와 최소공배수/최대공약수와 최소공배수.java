class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = getGcd(n, m); // 최대공약수 계산
        int lcm = n * m / gcd; // 최소공배수 계산
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    // 최대공약수 계산 함수
    public int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return getGcd(b, a % b);
        }
    }
}