import java.util.*; 

public class Main {
    
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int multiple = 1;

        for (int i = 0; i < 3; i++) {
            int input = scanner.nextInt();
            multiple *= input;
        }
        scanner.close();

//        System.out.println(multiple);

        List<Integer> digits = new ArrayList<>();
        String numberStr = String.valueOf(multiple);

        for(char c : numberStr.toCharArray()) {
            digits.add(Character.getNumericValue(c)); // 각 문자를 숫자로 변환해 리스트에 추가
        }
        int cnt = 0;
        for(int j = 0; j < 10; j++) {
            for(int i = 0; i < digits.size(); i++) {
                if(digits.get(i) == j) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}
    