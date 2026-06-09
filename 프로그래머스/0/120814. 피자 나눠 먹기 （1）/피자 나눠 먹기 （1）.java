class Solution {
    public int solution(int n) {
        int q = n / 7;
        int r = n % 7;
        
        if (r != 0) {
            q++;
        }
        
        return q;
    }
}