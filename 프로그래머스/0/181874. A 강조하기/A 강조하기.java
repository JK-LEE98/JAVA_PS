class Solution {
    public String solution(String myString) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<myString.length(); i++) {
            char c = myString.charAt(i);
            
            if (c == 'a' || c == 'A') {
                sb.append('A');
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}