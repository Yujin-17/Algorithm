import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main { 

    public static void main(String[] args) {
        String regex = "^[ABCDEF]?A+F+C+[ABCDEF]?$";
        Pattern pattern = Pattern.compile(regex);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            boolean isMatch = matcher.matches();
            System.out.println(isMatch ? "Infected!" : "Good");
        }

        scanner.close();
    }
}