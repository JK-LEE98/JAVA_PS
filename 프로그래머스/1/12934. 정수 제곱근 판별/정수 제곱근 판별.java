class Solution {
    public long solution(long n) {
        for (long i=1; i <= n; i++) {
            if (n == i*i) {
                return (i+1) * (i+1);
            }
        }
        return -1;
    }
}