import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                             .filter(n -> n % divisor == 0)
                             .sorted()
                             .toArray();
        if (result.length == 0) {
            return new int[]{-1};
        }
        
        return result;
    }
}