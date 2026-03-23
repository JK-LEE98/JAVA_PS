class Solution {
    public int[] solution(int start_num, int end_num) {
        int num = end_num - start_num + 1;
        int k = start_num;
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = k;
            k++;
        }
        return arr;
    }
}