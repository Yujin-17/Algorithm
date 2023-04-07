public class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_array = my_string.toCharArray(); 
        char temp = my_array[num1]; 
        my_array[num1] = my_array[num2];  
        my_array[num2] = temp;  
        return new String(my_array);
    }
}