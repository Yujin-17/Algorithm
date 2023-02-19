    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {};
            int zero = 0;
            int collect = 0;
            
            for(int i : lottos) {
                if (i == 0) {
                    zero++;
                } else {
                    for (int j : win_nums) {
                        if (j == i) {
                            collect++;
                        }
                    }

                }
            }
            int min = collect;
            int max = collect + zero;
            answer = new int[]{Math.min(7 - max, 6), Math.min(7 - min, 6)};


            return answer;
        }
    }