class Solution {
    public int solution(int n) { // solution이라는 함수 안에 (매개변수)
        int sum = 1;
        int i = 1;

        while (n > sum) {
            sum *= i;
            if (sum == n) {
                break;
            } else if(sum > n) {
                i--;
                break;
            }
            i++;
        }

        int result = i;
        return result;
    }
}