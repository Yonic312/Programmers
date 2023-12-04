class Solution {
    public int solution(int n) { // solution이라는 함수 안에 (매개변수)
        int cnt = 0;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                   cnt ++;
                }
            }
            if (cnt >= 3) {
                result++;
            }
        }
        return result;
    }
}