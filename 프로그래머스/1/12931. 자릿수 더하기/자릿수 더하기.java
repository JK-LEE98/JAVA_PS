import java.util.*;

public class Solution {
    public int solution(int n) {
        int length = 0;
        int num = n;
        int sum = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        
        for (int i=0; i<length; i++) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}