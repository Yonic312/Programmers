class Solution {
    public int solution(int n, int t) { // solution이라는 함수 안에 (매개변수)
        int result = n;
        for (int i = 1; i <= t; i++) {
            result *= 2;
        }
        return result;
    }
}