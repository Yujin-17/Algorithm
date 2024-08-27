import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PriorityQueue<Integer> a = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs = Integer.compare(Math.abs(o1), Math.abs(o2));
                if(abs == 0) {
                    return Integer.compare(o1, o2);
                } else {
                    return abs;
                }
            }
        });

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            if (input == 0) {
                if(a.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(a.poll());
                }
            } else {
                a.add(input);
            }

        }

        scanner.close();
    }

}
