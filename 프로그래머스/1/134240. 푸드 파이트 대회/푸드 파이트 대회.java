class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[food.length];
        
        arr[0] = 1;
        
        for (int i=1; i<food.length; i++) {
            arr[i] = food[i] / 2;
        }
        
        for (int i=1; i<food.length; i++) {
            for (int j=0; j<arr[i]; j++) {
                sb.append(i);
            }
        }
        
        sb.append(0);
        
        for (int i=food.length-1; i>=1; i--) {
            for (int j=0; j<arr[i]; j++) {
                sb.append(i);
            }
        }
        
        return sb.toString();
    }
}