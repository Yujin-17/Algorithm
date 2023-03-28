class Solution {


public int solution(int order) {
int count = 0;
String strNum = String.valueOf(order);
for (int i = 0; i < strNum.length(); i++) {
char ch = strNum.charAt(i);
if (ch == '3' || ch == '6' || ch == '9') {
count++;
}
}
return count;
}
}