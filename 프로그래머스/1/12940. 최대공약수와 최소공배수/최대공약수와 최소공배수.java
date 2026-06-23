class Solution {
    public int[] solution(int n, int m) {
        int[] arr = new int[2];
        
        if (n % m == 0) {
            arr[0] = m;
            arr[1] = n;
        } else if (m % n == 0) {
            arr[0] = n;
            arr[1] = m;
        } else {
            for (int i=1; i<Math.max(n, m); i++) {
                if (m % i == 0 && n % i ==0) {
                    arr[0] = i;
                    int Num1 = m / i;
                    int Num2 = n / i;
                    arr[1] = i * Num1 * Num2;
                }
            }
        }

        return arr;
    }
}