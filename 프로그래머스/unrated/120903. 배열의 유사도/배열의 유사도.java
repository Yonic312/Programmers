class Solution {
    public int solution(String[] s1, String[] s2) { // solution이라는 함수 안에 (매개변수)
        int cnt = 0;
        for (String str1: s1) {
            for (String str2: s2) {
                if(str1.equals(str2)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}