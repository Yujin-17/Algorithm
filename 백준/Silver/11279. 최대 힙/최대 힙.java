import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 우선순위 큐를 사용하여 최대값을 관리
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            if(input == 0) {
                if(maxHeap.isEmpty()) {
                    System.out.println(0);
                } else {
                    int max = maxHeap.poll(); // 큐에서 최대값 꺼내기
                    System.out.println(max);
                }
            } else {
                maxHeap.add(input); // 큐에 값 추가
            }
        }

        scanner.close();
    }
}
