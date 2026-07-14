class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n>=a) {
            int r = (n / a) * b;
            int Num = n % a;  
            answer += r;
            n = r + Num;
        }
        
        return answer;
    }
}