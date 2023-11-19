class Solution {
    public int solution(int slice, int n) {
        int Pizza = slice; // 조각 수
        int cnt = 1;

        while (true) {
            if (Pizza * cnt >= n) {
                break;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}