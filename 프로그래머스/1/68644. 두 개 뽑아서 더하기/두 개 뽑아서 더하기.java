import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<numbers.length-1; i++) {
            int sum = 0;
            
            for (int j=i+1; j<numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        
        Collections.sort(list);
        
        int[] arr = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);       
        }
        
        return arr;
    }
}