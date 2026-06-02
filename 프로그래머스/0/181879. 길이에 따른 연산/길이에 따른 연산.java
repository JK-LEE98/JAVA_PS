class Solution {
    public int solution(int[] num_list) {
        int n = num_list.length;
        int sum = 0;
        int result = 1;
    
        if (n >= 11) {
            for (int i=0; i<n; i++) {
                sum += num_list[i];
            }
            
            return sum;
            
        } else {
            for (int i=0; i<n; i++) {
                result *= num_list[i];
            }
            
            return result;
        }
    }
}