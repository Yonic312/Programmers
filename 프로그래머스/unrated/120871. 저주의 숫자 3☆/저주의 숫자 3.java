class Solution {
    public int solution(int n) { // solution이라는 함수 안에 (매개변수)
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || Integer.toString(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}
