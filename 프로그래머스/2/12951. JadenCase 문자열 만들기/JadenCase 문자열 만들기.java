// 공백을 기준으로 문자열을 쪼갠다 -> X
// 문제 조건을 보면 **공백문자가 연속해서 나올 수 있다.**는 조건이 있음.
// 공백 기준이 아니라 전체 문자열을 순회하면서 공백이 아닌 문자열을 보고 판단해야 한다.
// 그러려면 이전 문자가 문자열의 시작 문자인지 확인해야 함
// 문자를 확인한 결과 시작 문자가 숫자일 경우 그대로 출력하고 문자일 경우 대문자로 변경한다.
class Solution {
    public String solution(String s) {     
        char[] arr = s.toCharArray();
        boolean isFirst = true;
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') {
                isFirst = true;
            } else {
                if (isFirst) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
                
                isFirst = false;
            }
        }
        
        return new String(arr);
    }
}