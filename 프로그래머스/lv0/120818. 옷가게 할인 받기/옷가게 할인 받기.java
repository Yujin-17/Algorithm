public class Solution {
    public int solution(int price) {
        int discount = 0; 
        int payable = price; 
        
        if (price >= 500000) {
            discount = 20;
        } else if (price >= 300000) {
            discount = 10;
        } else if (price >= 100000) {
            discount = 5;
        }
        
        if (discount > 0) {
            payable = (int)(price * (100.0 - discount) / 100.0);
        }
    return payable;
}
}