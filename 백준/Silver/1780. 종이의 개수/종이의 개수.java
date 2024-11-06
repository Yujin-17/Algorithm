import java.util.Scanner;

public class Main {
    // -1, 0, 1로 채워진 종이의 개수를 저장할 변수
    static int countMinus1 = 0;
    static int count0 = 0;
    static int count1 = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 행렬 크기 N 입력
        int[][] matrix = new int[n][n];

        // 행렬 값 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // 초기 호출
        divideAndConquer(matrix, 0, 0, n);

        // 결과 출력
        System.out.println(countMinus1);
        System.out.println(count0);
        System.out.println(count1);
    }
    
    // 현재 종이가 같은 숫자로 이루어져 있는지 확인하는 함수
    public static boolean checkSame(int[][] matrix, int x, int y, int size) {
        int firstValue = matrix[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (matrix[i][j] != firstValue) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // 종이를 재귀적으로 나누는 함수
    public static void divideAndConquer(int[][] matrix, int x, int y, int size) {
        // 현재 종이가 모두 같은 숫자로 채워져 있다면
        if (checkSame(matrix, x, y, size)) {
            // 해당 숫자에 따라 카운트를 증가
            if (matrix[x][y] == -1) {
                countMinus1++;
            } else if (matrix[x][y] == 0) {
                count0++;
            } else {
                count1++;
            }
        } else {
            // 3x3 분할
            int newSize = size / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // 각 작은 종이에 대해 divideAndConquer 호출
                    divideAndConquer(matrix, x + i * newSize, y + j * newSize, newSize);
                }
            }
        }
    }
}
