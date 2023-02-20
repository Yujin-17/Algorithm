public class Main {
    public int solution(String s) {
        int answer = 0;
        int a = 0;
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'O') {
                a++;
                answer += a;
            }else a = 0;

        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}
