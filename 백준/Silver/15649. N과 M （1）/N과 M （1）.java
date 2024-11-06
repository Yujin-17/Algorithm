
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.close();

        ArrayList<Integer> a = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        backtrack(n, m, a, visited);

    }

    public static void backtrack(int n, int m, List<Integer> sequence, boolean[] visited) {
        if (sequence.size() == m) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++ ){
            if (!visited[i]) {
                visited[i] = true;
                sequence.add(i);
                backtrack(n, m, sequence, visited);
                sequence.remove(sequence.size() - 1);
                visited[i] = false;
            }
        }
    }

}
