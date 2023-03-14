import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); 
        int n = numbers.length;
        int max = numbers[n - 1] * numbers[n - 2]; // 가장 큰 두 수를 곱한 값이 최댓값이 됨
        return max;
    }
}
