import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int k = nums.length/2;
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }
        
        int distinctCount = set.size();
        
        return Math.min(distinctCount, k);
    }
}