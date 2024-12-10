import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int cnt = scanner.nextInt();

        int[] bulbs = new int[num];
        for(int i = 0; i < num; i++) {
            bulbs[i] = scanner.nextInt();
        }

        for(int i = 0; i < cnt; i++) {
            int command = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(command == 1) {
                bulbs[b-1] = c;
            } else if(command == 2) {
                for (int j = b - 1; j < c; j++) {
                    bulbs[j] = (bulbs[j] == 0) ? 1 : 0;
                }
            } else if (command == 3) {
                for (int j = b - 1; j < c; j++) {
                    bulbs[j] = 0;
                }
            } else if (command == 4) {
                for (int j = b - 1; j < c; j++) {
                    bulbs[j] = 1;
                }
            }
        }

        for(int state : bulbs) {
            System.out.print(state + " ");
        }

    }
}
