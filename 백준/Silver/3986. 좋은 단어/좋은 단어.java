import java.util.*;

public class Main {
    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
         
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        scanner.close();

        int cnt = 0;
        for(int i = 0; i < list.size(); i++){
            Stack<Character> stack = new Stack<>();
            for(char ch : list.get(i).toCharArray()){
                if(!stack.isEmpty() && stack.peek() == ch){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            if(stack.isEmpty()){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}