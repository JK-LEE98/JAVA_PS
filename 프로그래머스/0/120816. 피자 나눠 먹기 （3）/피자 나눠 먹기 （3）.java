class Solution {
    public int solution(int slice, int n) {
        int q = n / slice;
        int r = n % slice;
        
        if (r != 0) {
            q += 1;
        }
        
        return q;
    }
}