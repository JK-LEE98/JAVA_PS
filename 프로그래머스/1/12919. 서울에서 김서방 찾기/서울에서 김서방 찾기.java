class Solution {
    public String solution(String[] seoul) {
        String target = "Kim";
        int n = 0;
        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals(target)) {
                n = i;
            }
        }
        return ("김서방은 " + n + "에" + " 있다");
    }
}