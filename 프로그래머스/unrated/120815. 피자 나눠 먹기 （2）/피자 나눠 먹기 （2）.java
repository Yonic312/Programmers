class Solution {
    public int solution(int n) {
        int Pizza = 6;
        int cnt = 1;

        while (true) {
            if (Pizza * cnt % n == 0) {
                break;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}