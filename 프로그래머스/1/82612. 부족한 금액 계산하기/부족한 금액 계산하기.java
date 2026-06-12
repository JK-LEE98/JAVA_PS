class Solution {
    public long solution(int price, int money, int count) {
        long total_price = 0;
        
        for (int i=1; i<=count; i++) {
            total_price += price * i;
        }
        
        long answer = 0;
        
        if (total_price > money) {
            answer = total_price - money;
        }        
        
        return answer;
    }
}