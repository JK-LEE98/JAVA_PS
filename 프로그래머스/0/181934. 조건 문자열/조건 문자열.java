// ineq, eq가 문자열이다. 이걸 실제 크기 비교로 변환시켜야 한다.

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else {
                return n > m ? 1 : 0;
            } 
        } else {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else {
                return n < m ? 1 : 0;
            }
        }
    }
}