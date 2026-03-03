class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i=0; i<absolutes.length; i++) {
            result += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return result;
    }
}