import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        int last_num = num_list[num_list.length - 1];
        int prev_num = num_list[num_list.length - 2];
        
        int newNum = last_num > prev_num ? last_num - prev_num : last_num * 2;
        
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);        
        
        answer[num_list.length] = newNum;
        
        return answer;
    }
}