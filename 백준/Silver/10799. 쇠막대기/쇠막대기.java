import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int cnt = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // 여는 괄호일 때는 스택에 추가하여 열려있는 쇠막대기 수를 표시
                stack.push(ch);
            } else {
                // 닫는 괄호가 나왔을 때
                stack.pop();

                if (s.charAt(i - 1) == '(') {
                    // 레이저인 경우 (이전 문자가 '('인 경우)
                    cnt += stack.size();
                } else {
                    // 쇠막대기의 끝인 경우
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
