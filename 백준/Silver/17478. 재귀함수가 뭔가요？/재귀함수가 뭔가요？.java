import java.util.*;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 재귀 횟수 입력
        scanner.close();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        chatbot(n, 0); // 재귀 함수 호출
    }

    // 재귀 함수
    public static void chatbot(int totalDepth, int currentDepth) {
        // 질문 출력
        printIndent(currentDepth);
        System.out.println("\"재귀함수가 뭔가요?\"");

        // 재귀 깊이에 따라 다른 출력
        if (currentDepth == totalDepth) {
            printIndent(currentDepth);
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            // 일반적인 답변
            printIndent(currentDepth);
            System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            printIndent(currentDepth);
            System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            printIndent(currentDepth);
            System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

            // 다음 깊이로 재귀 호출
            chatbot(totalDepth, currentDepth + 1);
        }

        // 답변 종료 부분 출력
        printIndent(currentDepth);
        System.out.println("라고 답변하였지.");
    }

    // 들여쓰기 메서드
    public static void printIndent(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("____"); // 4칸 공백
        }
    }
}