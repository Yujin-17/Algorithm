import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] selected;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();
        
        // 결과 수열을 저장할 배열 초기화
        selected = new int[M];
        
        // 백트래킹 함수 호출
        backtrack(1, 0);
        
        sc.close();
    }
    
    // 백트래킹 함수
    public static void backtrack(int start, int depth) {
        // 길이가 M인 수열을 만든 경우 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }
        
        // 현재 위치(start)부터 N까지 반복
        for (int i = start; i <= N; i++) {
            // 현재 숫자를 선택
            selected[depth] = i;
            
            // 다음 숫자를 고르기 위해 재귀 호출 (오름차순을 위해 i + 1 사용)
            backtrack(i + 1, depth + 1);
        }
    }
}
