import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        List<Integer> digits = new ArrayList<>();
        String numberStr = String.valueOf(num);

        for (char c : numberStr.toCharArray()) {
            digits.add(Character.getNumericValue(c)); // 각 문자를 숫자로 변환해 리스트에 추가
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < digits.size(); i++) {
            int digit = digits.get(i);

            // 6과 9는 같은 숫자로 처리
            if (digit == 6 || digit == 9) {
                map.put(6, map.getOrDefault(6, 0) + 1);  // 6으로 처리
            } else {
                map.put(digit, map.getOrDefault(digit, 0) + 1);
            }
        }

        // 6의 개수를 반으로 나누고 올림 처리
        if (map.containsKey(6)) {
            map.put(6, (map.get(6) + 1) / 2);  // 6과 9는 한 세트로 처리
        }

        // 가장 큰 값 찾기
        int maxValue = 0;

        for (int val : map.values()) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        System.out.println(maxValue);
    }
}
