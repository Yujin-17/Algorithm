import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int[] alphabetCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabetCount[c - 'a']++;
        }

        for (int count : alphabetCount) {
            System.out.print(count + " ");
        }
    }
}
