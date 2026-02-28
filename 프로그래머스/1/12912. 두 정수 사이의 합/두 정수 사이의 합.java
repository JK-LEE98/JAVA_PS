class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int start = a;
        int end = b;
        
        if (a>b) {
            start = b;
            end = a;
        } 
        
        for (int i=start; i<=end; i++) {
            sum += i;
        }
        
        return sum;
    }
}