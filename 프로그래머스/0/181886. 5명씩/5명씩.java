import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        // 반드시 구할 필요는 없지만 '(names.length + 4) / 5' 가 그룹의 수가 된다.
        
        List<String> list = new ArrayList<>();
        
        for (int i=0; i<names.length; i+=5) {
            list.add(names[i]);
        }
        
        String[] answer = new String[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);    
        }
        
        return answer;
    }
}