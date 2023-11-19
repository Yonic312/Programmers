class Solution {
    public int solution(int n) {
        int cnt = 0;

        while (n != 0)
        if (n <= 7) {
            cnt++;
            n = 0;
        } else {
            n -= 7;
            cnt++;
        }
        return cnt;
    }
}