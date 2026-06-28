class Solution {
    public int[] solution(String s) {
        int[] arr = new int[s.length()];
        
        for (int i=0; i<s.length(); i++) {
            arr[i] = -1;
            
            for (int j=i-1; j>=0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    arr[i] = i-j;
                    break;
                } 
            }
        }
        
        return arr;
    }
}