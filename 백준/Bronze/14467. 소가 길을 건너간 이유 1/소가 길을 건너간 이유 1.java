import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for(int i = 0; i < cnt ; i++) {
            int num = scanner.nextInt();
            int direction = scanner.nextInt();

            if(!map.containsKey(num)) {
                map.put(num, direction);
            } else {
                if(map.get(num) != direction) {
                    sum++;
                    map.put(num, direction);
                }
            }

        }
        System.out.println(sum);

    }
}