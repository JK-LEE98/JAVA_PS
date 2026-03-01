class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char target1 = 'p';
        char target2 = 'P';
        char target3 = 'y';
        char target4 = 'Y';
        int countP = 0;
        int countY = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == target1) {
                countP++; 
            } else if (s.charAt(i) == target2) {
                countP++;
            } else if (s.charAt(i) == target3) {
                countY++;
            } else if (s.charAt(i) == target4) {
                countY++;
            }
        }

        if (countP == countY) {
            return answer;
        }
        
        return false;
    }
}