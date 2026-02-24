class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int sum = 0;
        
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        if (temp % sum == 0) {
            return answer;
        }
        
        return false;
    }
}