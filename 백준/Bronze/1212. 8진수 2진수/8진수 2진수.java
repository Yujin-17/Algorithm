import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String octal = scanner.next();

        BigInteger decimal = new BigInteger(octal, 8);
        String binary = decimal.toString(2);
        System.out.println(binary);
    }
}