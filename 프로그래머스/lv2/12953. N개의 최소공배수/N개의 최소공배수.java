class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer, arr[i]); // 최소공배수 함수 호출
        }
        return answer;
    }
    
    // 최소공배수 함수
    public int lcm(int a, int b){
        return a*b / gcd(a, b); // 두 수의 곱 / 최대공약수 = 최소공배수
    }
    
    // 최대공약수 함수 (유클리드 호제법 이용)
    public int gcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
