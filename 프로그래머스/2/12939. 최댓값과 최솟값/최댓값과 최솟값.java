class Solution {
    public String solution(String s) {
        // 공백으로 구분된 문자열 -> 공백을 기준으로 하나씩 쪼개기
        // 쪼갠 문자열을 숫자로 바꾸기
        // 정렬은 필요 없다 -> only 최대, 최소
        // 숫자를 다시 공백 하나를 둔 문자열로 출력
        
        String[] arr = s.split(" ");
        int maxNum = Integer.parseInt(arr[0]);
        int minNum = Integer.parseInt(arr[0]);
        
        for (String str : arr) {
            int num = Integer.parseInt(str);
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }
        
        return minNum + " " + maxNum;
    }
}