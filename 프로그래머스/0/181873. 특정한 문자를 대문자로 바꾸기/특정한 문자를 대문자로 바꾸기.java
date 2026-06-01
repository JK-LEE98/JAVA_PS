class Solution {
    public String solution(String my_string, String alp) {
        
        StringBuilder sb = new StringBuilder();
        char c_alp = alp.charAt(0);
        
        for (int i=0; i<my_string.length(); i++) {
            char c_my = my_string.charAt(i);
            
            if (c_my == c_alp) {
                sb.append(Character.toUpperCase(c_my));
            } else {
                sb.append(c_my);
            }
        }
        
        return sb.toString();
    }
}