import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int b = scanner.nextInt();
        //logic

        char c = a.charAt(b-1);
        System.out.println(c);


        //output
//        System.out.println(answer);
    }
}