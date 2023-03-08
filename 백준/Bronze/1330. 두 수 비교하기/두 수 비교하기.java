import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        //logic

        if(first > second){
            System.out.println(">");
        } else if (first < second) {
            System.out.println("<");
        }else System.out.println("==");

        //output
//        System.out.println(answer);
    }
}