class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for (int i=0; i<numbers.length; i++) {
            if (sum > n) {
                return sum;
            } else {
                sum += numbers[i];
            }
        }
        
        return sum;
    }
}