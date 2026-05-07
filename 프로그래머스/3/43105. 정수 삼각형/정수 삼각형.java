class Solution {
    public int solution(int[][] triangle) {
        // 처음 시작은 무조건 7
        // 7에서 선택지 [0], [1] 중 하나
        // 그 밑으로 갔을 때 무조건 본인 인덱스랑 같거나 본인 인덱스 +1 만 선택할 수 있음.
        // 의문: 무조건 그때 그 상황에서 가장 큰 값을 선택하는 것이 최대값일까? X 전체 탐색 하는 것이 올바른 방향일 듯 싶다.
        // 전체 탐색 -> DP가 맞는 방향이다. 즉, 각 칸까지 도달했을 때 최대 합을 구하는 문제다.

        int n = triangle.length;
        
        int[][] dp = new int[n][n];
        dp[0][0] = triangle[0][0];

        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i-1][i-1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])
                        + triangle[i][j];
                }
            }
        }
        
        int answer = 0;
        
        for (int j = 0; j <n; j++) {
            answer = Math.max(answer, dp[n-1][j]);
        }
        
        return answer;
    }
}