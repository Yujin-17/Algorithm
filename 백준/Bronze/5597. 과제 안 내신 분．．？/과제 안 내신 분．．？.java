import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[28];
        HashSet<Integer> hs = new HashSet<>();

        for(int j = 0; j < 28; j++) {
            hs.add(scanner.nextInt());
        }
        scanner.close();

        for(int i = 1; i < 31; i++) {
            if(!hs.contains(i)) {
                System.out.println(i);
            }
        }
    }
}