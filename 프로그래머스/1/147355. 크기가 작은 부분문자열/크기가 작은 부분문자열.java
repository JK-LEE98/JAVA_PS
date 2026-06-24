import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        long target = Long.parseLong(p);

        int count = 0;

        for (int i = 0; i <= t.length() - length; i++) {
            long num = Long.parseLong(t.substring(i, i + length));

            if (num <= target) {
                count++;
            }
        }

        return count;
    }
}