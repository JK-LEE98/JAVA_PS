import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        long num = n;
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        int[] arr = new int[length];
        for (int i=0; i<length; i++) {
            arr[i] = (int)(n%10);
            n /= 10;
        }
        
        return arr;
    }
}