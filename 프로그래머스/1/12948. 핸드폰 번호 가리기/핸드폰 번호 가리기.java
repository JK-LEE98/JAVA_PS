class Solution {
    public String solution(String phone_number) {
        
        StringBuilder sb = new StringBuilder();
        int n = phone_number.length();
        
        for (int i=0; i<n-4; i++) {
            sb.append("*");
        }
        
        sb.append(phone_number.substring(n-4,n));
        
        return sb.toString();
    }
}