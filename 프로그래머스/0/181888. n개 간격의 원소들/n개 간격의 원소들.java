import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        
        while (num_list.length > i) {
            list.add(num_list[i]);
            i += n;
        }
        
        int[] answer = new int[list.size()];
        
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);            
        }
        
        return answer;
    }
}