import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        int num = scanner.nextInt();
        scanner.close();
        int cnt = 0;

        for (Integer value : set) {
            int complement = num - value;
            // check if complement exists in the set
            if (set.contains(complement)) {
                cnt++;
            }
        }

        // Since we count each pair twice (a + b) and (b + a), we divide the count by 2
        System.out.println(cnt / 2);
    }
}
