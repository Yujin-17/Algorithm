class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        
        int gcd = getGcd(numerator, denominator);
        
        answer[0] = numerator / gcd;
        answer[1] = denominator / gcd;
        
        return answer;
    }
    
    public int getGcd(int a, int b) {
        if (b == 0) return a;
        return getGcd(b, a % b);
    }
}