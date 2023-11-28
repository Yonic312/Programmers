class Solution {
    public int solution(int n, int k) {
        int result = 0;

        if (n / 10 != 0) {
            result = (n * 12000) + ((k - n / 10) * 2000);
        } else {
            result = (n * 12000) + (k * 2000);
        }

        return result;
    }
}