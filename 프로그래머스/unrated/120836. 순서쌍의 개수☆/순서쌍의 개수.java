class Solution {
    public int solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt + 1;
    }
}
