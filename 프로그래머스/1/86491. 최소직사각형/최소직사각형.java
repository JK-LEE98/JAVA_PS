class Solution {
    public int solution(int[][] sizes) {
        
        // 회전이 허용된 문제이기 때문에 큰 값을 가로, 작은 값을 세로로 통일한다.
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            
            int width = Math.max(w, h);
            int height = Math.min(w, h);
            
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        return maxWidth * maxHeight;
    }
}