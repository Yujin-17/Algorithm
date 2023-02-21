import java.util.ArrayList;
import java.util.List;


class Solution {
    public static int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 1. Count correct count per person
        int[] hit = new int[3];
        for(int personIdx = 0; personIdx < hit.length; personIdx++)
            for(int probIdx = 0; probIdx < answers.length; probIdx++)
                if(patterns[personIdx][probIdx % patterns[personIdx].length] == answers[probIdx])
                    hit[personIdx]++;

        // 2. Find Max Count
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));

        // 3. Find Max Players
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i])
                list.add(i + 1);

        // 4. Make answer array
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
    }
}