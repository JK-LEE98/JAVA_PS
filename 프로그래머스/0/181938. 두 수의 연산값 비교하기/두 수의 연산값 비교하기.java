class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int tempB = b;
        int count = 0;
        while (tempB != 0) {
            tempB /= 10;
            count++;
        }
        
        int pow = 1;
        for (int i=0; i<count; i++) {
            pow *= 10;
        }
        
        int temp1 = a * pow + b;
        int temp2 = 2 * a * b;
        
        answer = Math.max(temp1, temp2);
        return answer;
    }
}