class Solution {
public int solution(int n) {
    int cnt = Integer.bitCount(n); // 이진수로 변환 후 1의 갯수를 세어준다.
    
    while (true) {
        n++;
        if (cnt == Integer.bitCount(n)) {
            break;
        }
    }
    
    return n;
}

}
