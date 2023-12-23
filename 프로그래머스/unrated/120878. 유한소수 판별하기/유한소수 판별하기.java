class Solution {
    public int solution(int a, int b) {
        // 분모 기약분수 만들기
        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) {
                b /= 2;
            }
            if (b % 5 == 0) {
                b /= 5;
            }
        }
        // 기약분수인 분모로 분자를 나눠봄
        return a % b == 0 ? 1 : 2;
    }
}
