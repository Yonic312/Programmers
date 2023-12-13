class Solution {
    public int solution(int n) { // solution이라는 함수 안에 (매개변수)
        int result = 2;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n == Math.pow(i, 2)) {
                result = 1;
                break;
            }
        }
        return result;
    }
}