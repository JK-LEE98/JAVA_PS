class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int tempA = a;
        int tempB = b;
        int countA = 0;
        int countB = 0;
        
        while(tempB != 0) {
            tempB /= 10;
            countB++;
        }
        
        int powB = 1;
        for (int i=0; i<countB; i++) {
            powB *= 10;
        }
        
        int temp1 = a * powB + b;
        
        while(tempA != 0) {
            tempA /= 10;
            countA++;
        }
        
        int powA = 1;
        for (int i=0; i<countA; i++) {
            powA *= 10;
        }
        
        int temp2 = b * powA + a;
        answer = Math.max(temp1, temp2);
        
        return answer;
    }
}