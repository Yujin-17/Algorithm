
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int count = scanner.nextInt(); 

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < count; j++) {
                int num = scanner.nextInt();
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            System.out.println(min + " " + max);
        }
    }
}