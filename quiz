public class Main {
    public int solution(int num) {
        int answer = 0;

        answer += (1000 - num) / 500;
        answer += ((1000 - num) % 500) / 100;
        answer += ((1000 - num) % 500 % 100) / 50;
        answer += ((1000 - num) % 500 % 100 % 50) / 10;
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }
}
