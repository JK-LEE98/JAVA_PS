class Solution {
    public String solution(String s) {
        int n = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            return s.substring(n-1, n+1);    
        } else {
            return s.substring(n, n+1);
        }
    }
}