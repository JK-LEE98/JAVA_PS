class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        int m = n/2;
        
        for (int i=0; i<m; i++) {
            sb.append("수박");    
        }
        
        if (n%2 == 1) {
            sb.append("수");
        }
        
        return sb.toString();
    }
}