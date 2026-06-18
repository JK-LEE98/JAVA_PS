class Solution {
    public String solution(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (i>=0 || j>=0) {
            int numA = i >= 0 ? a.charAt(i) - '0' : 0;
            int numB = j >= 0 ? b.charAt(j) - '0' : 0;
            sum = numA + numB + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        
        if (carry > 0) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}