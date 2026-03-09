class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;
        while (num != 1) {
            if (num%2==0) {
                num /= 2;
            } else if (num%2==1) {
                num = (num*3) + 1;
            }
            count++;
            
            if (count == 500) {
                return -1;
            }
        }
        
        return count;
    }
}