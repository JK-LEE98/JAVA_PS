class Solution {
    public int solution(int[] num_list) {
        int num1 = 1;
        int num2 = 0;
        
        for (int i=0; i<num_list.length; i++) {
            num1 *= num_list[i];
        }
        
        for (int i=0; i<num_list.length; i++) {
            num2 += num_list[i];
        }
        
        int num3 = num2 * num2;
        
        return num1 < num3 ? 1 : 0;
        
    }
}