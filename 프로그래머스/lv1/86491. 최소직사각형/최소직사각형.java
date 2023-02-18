    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int maxw = 0;
            int maxh = 0;

            for(int i = 0; i < sizes.length; i++){
                for(int j = 0; j < sizes[i].length; j++){
                    int w = Math.max(sizes[i][0], sizes[i][1]);
                    int h = Math.min(sizes[i][0], sizes[i][1]);
                    maxw = Math.max(maxw, w);
                    maxh = Math.max(maxh, h);
                        
                }
            }
            answer = maxw * maxh;
            return answer;
        }
    }