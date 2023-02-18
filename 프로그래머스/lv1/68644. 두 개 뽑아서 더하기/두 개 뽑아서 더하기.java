import java.util.*;    
          class Solution {
        public ArrayList<Integer> solution(int[] numbers) {
            int[] answer = {};
            int any = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < numbers.length - 1; i++){
                for(int j = i + 1 ; j < numbers.length ; j++){
                    any = numbers[i] + numbers[j];
                    if(!list.contains(any)) {
                        list.add(any);
                    }
                }
                System.out.println(list);
                Collections.sort(list);
            }
            return list;
        }
    }