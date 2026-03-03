import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int[] target = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int num : numbers) {
            set.add(num);
        }
        
        int sum = 0;
        for (int num : target) {
            if (!set.contains(num)) {
                sum += num;
            }
        }
        return sum;
        
        }
}