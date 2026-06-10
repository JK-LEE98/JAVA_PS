class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                sb1.append(num_list[i]);
            } else {
                sb2.append(num_list[i]);
            }
        }
        
        int result = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        
        return result;
    }
}