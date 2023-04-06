class Solution {
       public static int solution(int[] box, int n) {
        int width = box[0];
        int height = box[1];
        int depth = box[2];
        
        int maxDice = (width / n) * (height / n) * (depth / n);
        return maxDice;
    }
}